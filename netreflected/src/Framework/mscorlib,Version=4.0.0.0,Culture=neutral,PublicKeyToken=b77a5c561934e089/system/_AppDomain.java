/*
 *  MIT License
 *
 *  Copyright (c) 2020 MASES s.r.l.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

/**************************************************************************************
 * <auto-generated>
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.security.policy.Evidence;
import system.reflection.Assembly;
import system.reflection.AssemblyName;
import system.reflection.emit.AssemblyBuilder;
import system.reflection.emit.AssemblyBuilderAccess;
import system.security.PermissionSet;
import system.runtime.remoting.ObjectHandle;
import system.reflection.BindingFlags;
import system.reflection.Binder;
import system.globalization.CultureInfo;
import system.CrossAppDomainDelegate;
import system.UInt32;
import system.security.policy.PolicyLevel;
import system.security.principal.PrincipalPolicy;
import system.security.principal.IPrincipal;
import system.security.principal.IPrincipalImplementation;
import system.AssemblyLoadEventHandler;
import system.EventHandler;
import system.ResolveEventHandler;
import system.UnhandledExceptionEventHandler;


/**
 * The base .NET class managing System._AppDomain, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Implements {@link IJCOBridgeReflected}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System._AppDomain" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System._AppDomain</a>
 */
public interface _AppDomain extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System._AppDomain
     */
    public static final String className = "System._AppDomain";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link _AppDomain}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link _AppDomain} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static _AppDomain To_AppDomain(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089");
        JCType classType = bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new _AppDomainImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link Object} representing the instance of the instantiated Class
     */
    public Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public int ExecuteAssembly(java.lang.String assemblyFile) throws Throwable;

    public int ExecuteAssembly(java.lang.String assemblyFile, Evidence assemblySecurity) throws Throwable;

    public int ExecuteAssembly(java.lang.String assemblyFile, Evidence assemblySecurity, java.lang.String[] args) throws Throwable;

    public int ExecuteAssembly(java.lang.String dupParam0, Evidence dupParam1, JCRefOut dupParam2) throws Throwable;

    public NetObject GetData(java.lang.String name) throws Throwable;

    public NetObject GetLifetimeService() throws Throwable;

    public NetObject InitializeLifetimeService() throws Throwable;

    public Assembly Load(byte[] rawAssembly) throws Throwable;

    public Assembly Load(JCRefOut dupParam0) throws Throwable;

    public Assembly Load(byte[] rawAssembly, byte[] rawSymbolStore) throws Throwable;

    public Assembly Load(JCRefOut dupParam0, JCRefOut dupParam1) throws Throwable;

    public Assembly Load(byte[] rawAssembly, byte[] rawSymbolStore, Evidence securityEvidence) throws Throwable;

    public Assembly Load(JCRefOut dupParam0, JCRefOut dupParam1, Evidence dupParam2) throws Throwable;

    public Assembly Load(AssemblyName assemblyRef) throws Throwable;

    public Assembly Load(AssemblyName assemblyRef, Evidence assemblySecurity) throws Throwable;

    public Assembly Load(java.lang.String assemblyString) throws Throwable;

    public Assembly Load(java.lang.String assemblyString, Evidence assemblySecurity) throws Throwable;

    public Assembly[] GetAssemblies() throws Throwable;

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access) throws Throwable;

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, PermissionSet requiredPermissions, PermissionSet optionalPermissions, PermissionSet refusedPermissions) throws Throwable;

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, Evidence evidence) throws Throwable;

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, Evidence evidence, PermissionSet requiredPermissions, PermissionSet optionalPermissions, PermissionSet refusedPermissions) throws Throwable;

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, java.lang.String dir) throws Throwable;

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, java.lang.String dir, PermissionSet requiredPermissions, PermissionSet optionalPermissions, PermissionSet refusedPermissions) throws Throwable;

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, java.lang.String dir, Evidence evidence) throws Throwable;

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, java.lang.String dir, Evidence evidence, PermissionSet requiredPermissions, PermissionSet optionalPermissions, PermissionSet refusedPermissions) throws Throwable;

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, java.lang.String dir, Evidence evidence, PermissionSet requiredPermissions, PermissionSet optionalPermissions, PermissionSet refusedPermissions, boolean isSynchronized) throws Throwable;

    public ObjectHandle CreateInstance(java.lang.String assemblyName, java.lang.String typeName) throws Throwable;

    public ObjectHandle CreateInstance(java.lang.String assemblyName, java.lang.String typeName, boolean ignoreCase, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes, Evidence securityAttributes) throws Throwable;

    public ObjectHandle CreateInstance(java.lang.String assemblyName, java.lang.String typeName, NetObject[] activationAttributes) throws Throwable;

    public ObjectHandle CreateInstanceFrom(java.lang.String assemblyFile, java.lang.String typeName) throws Throwable;

    public ObjectHandle CreateInstanceFrom(java.lang.String assemblyFile, java.lang.String typeName, boolean ignoreCase, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes, Evidence securityAttributes) throws Throwable;

    public ObjectHandle CreateInstanceFrom(java.lang.String assemblyFile, java.lang.String typeName, NetObject[] activationAttributes) throws Throwable;

    public void AppendPrivatePath(java.lang.String path) throws Throwable;

    public void ClearPrivatePath() throws Throwable;

    public void ClearShadowCopyPath() throws Throwable;

    public void DoCallBack(CrossAppDomainDelegate theDelegate) throws Throwable;

    public void SetAppDomainPolicy(PolicyLevel domainPolicy) throws Throwable;

    public void SetCachePath(java.lang.String s) throws Throwable;

    public void SetData(java.lang.String name, NetObject data) throws Throwable;

    public void SetPrincipalPolicy(PrincipalPolicy policy) throws Throwable;

    public void SetShadowCopyPath(java.lang.String s) throws Throwable;

    public void SetThreadPrincipal(IPrincipal principal) throws Throwable;


    
    // Properties section
    
    public boolean getShadowCopyFiles() throws Throwable;

    public Evidence getEvidence() throws Throwable;

    public java.lang.String getBaseDirectory() throws Throwable;

    public java.lang.String getDynamicDirectory() throws Throwable;

    public java.lang.String getFriendlyName() throws Throwable;

    public java.lang.String getRelativeSearchPath() throws Throwable;



    // Instance Events section
    
    public void addAssemblyLoad(AssemblyLoadEventHandler handler) throws Throwable;

    public void removeAssemblyLoad(AssemblyLoadEventHandler handler) throws Throwable;

    public void addDomainUnload(EventHandler handler) throws Throwable;

    public void removeDomainUnload(EventHandler handler) throws Throwable;

    public void addProcessExit(EventHandler handler) throws Throwable;

    public void removeProcessExit(EventHandler handler) throws Throwable;

    public void addAssemblyResolve(ResolveEventHandler handler) throws Throwable;

    public void removeAssemblyResolve(ResolveEventHandler handler) throws Throwable;

    public void addResourceResolve(ResolveEventHandler handler) throws Throwable;

    public void removeResourceResolve(ResolveEventHandler handler) throws Throwable;

    public void addTypeResolve(ResolveEventHandler handler) throws Throwable;

    public void removeTypeResolve(ResolveEventHandler handler) throws Throwable;

    public void addUnhandledException(UnhandledExceptionEventHandler handler) throws Throwable;

    public void removeUnhandledException(UnhandledExceptionEventHandler handler) throws Throwable;


}