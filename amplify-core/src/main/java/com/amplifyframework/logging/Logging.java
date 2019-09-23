/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amplifyframework.logging;

import android.content.Context;
import android.support.annotation.NonNull;

import com.amplifyframework.core.category.Category;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.exception.ConfigurationException;
import com.amplifyframework.core.plugin.PluginException;

public class Logging implements Category<LoggingPlugin, LoggingPluginConfiguration>, LoggingCategoryBehavior {
    /**
     * Read the configuration from amplifyconfiguration.json file
     *
     * @param context Android context required to read the contents of file
     * @throws ConfigurationException thrown when already configured
     * @throws PluginException        thrown when there is no plugin found for a configuration
     */
    @Override
    public void configure(@NonNull Context context) throws ConfigurationException, PluginException {

    }

    /**
     * Read the configuration from amplifyconfiguration.json file
     *
     * @param context     Android context required to read the contents of file
     * @param environment specifies the name of the environment being operated on.
     *                    For example, "Default", "Custom", etc.
     * @throws ConfigurationException thrown when already configured
     * @throws PluginException        thrown when there is no plugin found for a configuration
     */
    @Override
    public void configure(@NonNull Context context, @NonNull String environment) throws ConfigurationException, PluginException {

    }

    /**
     * Register a plugin with Amplify
     *
     * @param plugin an implementation of a CATEGORY_TYPE that
     *               conforms to the {@link Plugin} interface.
     * @throws PluginException when a plugin cannot be registered for this category
     */
    @Override
    public void addPlugin(@NonNull LoggingPlugin plugin) throws PluginException {

    }

    /**
     * Register a plugin with Amplify
     *
     * @param plugin              an implementation of a Category that
     *                            conforms to the {@link Plugin} interface.
     * @param pluginConfiguration configuration information for the plugin.
     * @throws PluginException when a plugin cannot be registered for this category
     */
    @Override
    public void addPlugin(@NonNull LoggingPlugin plugin, @NonNull LoggingPluginConfiguration pluginConfiguration) throws PluginException {

    }

    /**
     * Remove a registered plugin
     *
     * @param plugin an implementation of a Category that
     *               conforms to the {@link Plugin} interface
     * @throws PluginException when a plugin cannot be registered for this category
     */
    @Override
    public void removePlugin(@NonNull LoggingPlugin plugin) throws PluginException {

    }

    /**
     * Reset Amplify to state where it is not configured.
     * <p>
     * Remove all the plugins added.
     * Remove the configuration stored.
     */
    @Override
    public void reset() {

    }

    /**
     * Retrieve a plugin of CATEGORY_TYPE.
     *
     * @param pluginKey the key that identifies the plugin implementation
     * @return the plugin object
     */
    @Override
    public LoggingPlugin getPlugin(@NonNull String pluginKey) throws PluginException {
        return null;
    }

    @Override
    public CategoryType getCategoryType() {
        return null;
    }
}