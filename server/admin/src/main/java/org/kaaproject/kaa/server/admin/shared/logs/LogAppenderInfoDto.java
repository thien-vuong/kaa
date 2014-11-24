/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaaproject.kaa.server.admin.shared.logs;

import java.io.Serializable;

import org.kaaproject.kaa.server.common.avro.ui.shared.RecordField;

public class LogAppenderInfoDto implements Serializable {

    private static final long serialVersionUID = 5417936799807172505L;
    
    private String name;
    private RecordField configForm;
    private String appenderClassName;
    
    public LogAppenderInfoDto() {
        super();
    }

    public LogAppenderInfoDto(String name,
            RecordField configForm, String appenderClassName) {
        super();
        this.name = name;
        this.configForm = configForm;
        this.appenderClassName = appenderClassName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecordField getConfigForm() {
        return configForm;
    }

    public String getAppenderClassName() {
        return appenderClassName;
    }

    public void setAppenderClassName(String appenderClassName) {
        this.appenderClassName = appenderClassName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime
                * result
                + ((appenderClassName == null) ? 0 : appenderClassName
                        .hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        LogAppenderInfoDto other = (LogAppenderInfoDto) obj;
        if (appenderClassName == null) {
            if (other.appenderClassName != null) {
                return false;
            }
        } else if (!appenderClassName.equals(other.appenderClassName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LogAppenderInfoDto [name=" + name + ", configForm="
                + configForm + ", appenderClassName=" + appenderClassName + "]";
    }

}
