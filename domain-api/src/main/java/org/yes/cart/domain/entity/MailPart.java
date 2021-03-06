/*
 * Copyright 2009 Denys Pavlov, Igor Azarnyi
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.yes.cart.domain.entity;

/**
 * User: denispavlov
 * Date: 08/11/2013
 * Time: 17:58
 */
public interface MailPart extends Auditable {

    /**
     * @return mail part PK
     */
    long getMailPartId();

    /**
     * @param mailPartId mail part PK
     */
    void setMailPartId(final long mailPartId);


    /**
     * @return resource id
     */
    String getResourceId();

    /**
     * @param resourceId resource id
     */
    void setResourceId(String resourceId);

    /**
     * @return file name
     */
    String getFilename();

    /**
     * @param filename file name
     */
    void setFilename(String filename);

    /**
     * @return content part data
     */
    byte[] getData();

    /**
     * @param data content part data
     */
    void setData(byte[] data);

}
