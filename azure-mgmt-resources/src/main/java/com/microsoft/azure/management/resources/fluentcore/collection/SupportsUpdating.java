/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.collection;


// Requires class to support updating entities
public interface SupportsUpdating<T> {
	T update(String name);
}
