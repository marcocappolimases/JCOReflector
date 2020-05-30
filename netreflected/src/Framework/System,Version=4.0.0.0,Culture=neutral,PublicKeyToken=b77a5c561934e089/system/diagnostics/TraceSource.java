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

package system.diagnostics;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.diagnostics.SourceLevels;
import system.diagnostics.TraceEventType;
import system.Guid;
import system.collections.specialized.StringDictionary;
import system.diagnostics.TraceListenerCollection;
import system.diagnostics.SourceSwitch;


/**
 * The base .NET class managing System.Diagnostics.TraceSource, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class TraceSource extends NetObject  {
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System";
    public static final String className = "System.Diagnostics.TraceSource";
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

    public TraceSource(Object instance) throws Throwable {
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

    public static TraceSource castFrom(IJCOBridgeReflected from) throws Throwable {
        return new TraceSource(from.getJCOInstance());
    }

    // Constructors section
    
    
    public TraceSource(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TraceSource(java.lang.String name, SourceLevels defaultLevel) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)name, (Object)defaultLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Close() throws Throwable, system.ArgumentException {
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Flush() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException {
        try {
            classInstance.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceEvent(TraceEventType eventType, int id) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("TraceEvent", (Object)eventType.getJCOInstance(), id);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceEvent(TraceEventType eventType, int id, java.lang.String message) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("TraceEvent", (Object)eventType.getJCOInstance(), id, (Object)message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceEvent(TraceEventType eventType, int id, java.lang.String format, NetObject... args) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("TraceEvent", (Object)eventType.getJCOInstance(), id, (Object)format, (Object[])toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceData(TraceEventType eventType, int id, NetObject data) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("TraceData", (Object)eventType.getJCOInstance(), id, (Object)data.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceData(TraceEventType eventType, int id, NetObject... data) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("TraceData", (Object)eventType.getJCOInstance(), id, (Object[])toObjectFromArray(data));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceInformation(java.lang.String message) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.io.PathTooLongException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("TraceInformation", (Object)message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceInformation(java.lang.String format, NetObject... args) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.io.PathTooLongException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("TraceInformation", (Object)format, (Object[])toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceTransfer(int id, java.lang.String message, Guid relatedActivityId) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("TraceTransfer", id, (Object)message, (Object)relatedActivityId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public StringDictionary getAttributes() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Attributes");
            return new StringDictionary(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TraceListenerCollection getListeners() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Listeners");
            return new TraceListenerCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SourceSwitch getSwitch() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Switch");
            return new SourceSwitch(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSwitch(SourceSwitch Switch) throws Throwable {
        try {
            classInstance.Set("Switch", (Object)Switch.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}