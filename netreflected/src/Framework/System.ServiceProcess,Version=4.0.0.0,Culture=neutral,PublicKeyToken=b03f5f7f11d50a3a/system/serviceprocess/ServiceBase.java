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
 *      This code was generated from a template using JCOReflector version 1.0.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.serviceprocess;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.serviceprocess.ServiceBase;
import system.runtime.remoting.ObjRef;
import system.diagnostics.EventLog;
import system.EventHandler;


/**
 * The base .NET class managing System.ServiceProcess.ServiceBase, System.ServiceProcess, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ServiceBase extends NetObject  {
    public static final String assemblyFullName = "System.ServiceProcess, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.ServiceProcess";
    public static final String className = "System.ServiceProcess.ServiceBase";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceBase(Object instance) throws Throwable {
        if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new Exception("Cannot manage object, it is not a JCObject");
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
        return classInstance;
    }

    public JCType getJCOType() {
        return classType;
    }

    public static ServiceBase castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ServiceBase(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ServiceBase() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void RequestAdditionalTime(int milliseconds) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("RequestAdditionalTime", milliseconds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Run(ServiceBase[] services) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, system.NullReferenceException, system.security.SecurityException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.ApplicationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.threading.AbandonedMutexException, system.CannotUnloadAppDomainException {
        try {
            classType.Invoke("Run", (Object)toObjectFromArray(services));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Run(ServiceBase service) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, system.security.SecurityException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.SynchronizationLockException, system.threading.AbandonedMutexException, system.CannotUnloadAppDomainException {
        try {
            classType.Invoke("Run", (Object)service.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Stop() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NullReferenceException, system.IndexOutOfRangeException, system.security.SecurityException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.SystemException, system.UnauthorizedAccessException, system.io.IOException, system.ApplicationException, system.CannotUnloadAppDomainException {
        try {
            classInstance.Invoke("Stop");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjRef CreateObjRef(NetType requestedType) throws Throwable, system.runtime.remoting.RemotingException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            JCObject objCreateObjRef = (JCObject)classInstance.Invoke("CreateObjRef", (Object)requestedType.getJCOInstance());
            return new ObjRef(objCreateObjRef);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getAutoLog() throws Throwable {
        try {
            return (boolean)classInstance.Get("AutoLog");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoLog(boolean AutoLog) throws Throwable {
        try {
            classInstance.Set("AutoLog", AutoLog);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getExitCode() throws Throwable {
        try {
            return (int)classInstance.Get("ExitCode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExitCode(int ExitCode) throws Throwable {
        try {
            classInstance.Set("ExitCode", ExitCode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanHandlePowerEvent() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanHandlePowerEvent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCanHandlePowerEvent(boolean CanHandlePowerEvent) throws Throwable {
        try {
            classInstance.Set("CanHandlePowerEvent", CanHandlePowerEvent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanHandleSessionChangeEvent() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanHandleSessionChangeEvent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCanHandleSessionChangeEvent(boolean CanHandleSessionChangeEvent) throws Throwable {
        try {
            classInstance.Set("CanHandleSessionChangeEvent", CanHandleSessionChangeEvent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanPauseAndContinue() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanPauseAndContinue");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCanPauseAndContinue(boolean CanPauseAndContinue) throws Throwable {
        try {
            classInstance.Set("CanPauseAndContinue", CanPauseAndContinue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanShutdown() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanShutdown");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCanShutdown(boolean CanShutdown) throws Throwable {
        try {
            classInstance.Set("CanShutdown", CanShutdown);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanStop() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanStop");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCanStop(boolean CanStop) throws Throwable {
        try {
            classInstance.Set("CanStop", CanStop);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventLog getEventLog() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EventLog");
            return new EventLog(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getServiceName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ServiceName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setServiceName(java.lang.String ServiceName) throws Throwable {
        try {
            classInstance.Set("ServiceName", (Object)ServiceName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}