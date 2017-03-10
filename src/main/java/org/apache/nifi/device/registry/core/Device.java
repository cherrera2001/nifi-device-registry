package org.apache.nifi.device.registry.core;

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * Created on 3/10/17.
 */


public abstract class Device {

    private String internalIPAddress;
    private String externalIPAddress;
    private String primaryNICMac;

    // Common Hardware based monitoring
    private String cpuTime;
    private String usedMem;
    private String freeMem;
    private String totalMem;
    private String processMemUsage;
    private String totalDiskSpace;
    private String freeDiskSpace;
}