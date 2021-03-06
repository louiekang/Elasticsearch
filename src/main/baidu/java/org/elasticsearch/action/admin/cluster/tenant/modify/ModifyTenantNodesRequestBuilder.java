/*
 * Copyright (c) 2017 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.elasticsearch.action.admin.cluster.tenant.modify;

import io.crate.sql.tree.TenantModificationOperation;

import org.elasticsearch.action.support.master.MasterNodeOperationRequestBuilder;
import org.elasticsearch.client.ElasticsearchClient;

public class ModifyTenantNodesRequestBuilder extends MasterNodeOperationRequestBuilder<ModifyTenantNodesRequest, ModifyTenantNodesResponse, ModifyTenantNodesRequestBuilder> {

    public ModifyTenantNodesRequestBuilder(ElasticsearchClient client, ModifyTenantNodesAction action, String nodeIp, int nodePort, String tenantName, TenantModificationOperation operation) {
        super(client, action, new ModifyTenantNodesRequest(nodeIp, nodePort, tenantName, operation));
    }
    
    public ModifyTenantNodesRequestBuilder(ElasticsearchClient client, ModifyTenantNodesAction action) {
        super(client, action, new ModifyTenantNodesRequest());
    }
}
