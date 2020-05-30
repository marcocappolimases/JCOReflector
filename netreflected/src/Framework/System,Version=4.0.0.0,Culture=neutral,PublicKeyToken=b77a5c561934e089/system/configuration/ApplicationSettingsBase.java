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

package system.configuration;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.configuration.SettingsContext;
import system.configuration.SettingsPropertyCollection;
import system.configuration.SettingsProviderCollection;
import system.configuration.SettingsPropertyValueCollection;
import system.componentmodel.PropertyChangedEventHandler;
import system.configuration.SettingChangingEventHandler;
import system.configuration.SettingsLoadedEventHandler;
import system.configuration.SettingsSavingEventHandler;


/**
 * The base .NET class managing System.Configuration.ApplicationSettingsBase, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class ApplicationSettingsBase extends NetObject  {
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System";
    public static final String className = "System.Configuration.ApplicationSettingsBase";
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

    public ApplicationSettingsBase(Object instance) throws Throwable {
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

    public static ApplicationSettingsBase castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ApplicationSettingsBase(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public NetObject GetPreviousVersion(java.lang.String propertyName) throws Throwable, system.configuration.SettingsPropertyNotFoundException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.InvalidOperationException, system.NotImplementedException, system.io.FileNotFoundException, system.FormatException, system.runtime.serialization.SerializationException, system.xml.XmlException, system.MissingMethodException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.TypeLoadException, system.reflection.TargetInvocationException {
        try {
            JCObject objGetPreviousVersion = (JCObject)classInstance.Invoke("GetPreviousVersion", (Object)propertyName);
            return new NetObject(objGetPreviousVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Reload() throws Throwable {
        try {
            classInstance.Invoke("Reload");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("Save");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Reset() throws Throwable {
        try {
            classInstance.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Upgrade() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException {
        try {
            classInstance.Invoke("Upgrade");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Initialize(SettingsContext context, SettingsPropertyCollection properties, SettingsProviderCollection providers) throws Throwable {
        try {
            classInstance.Invoke("Initialize", (Object)context.getJCOInstance(), (Object)properties.getJCOInstance(), (Object)providers.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public SettingsContext getContext() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Context");
            return new SettingsContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SettingsPropertyCollection getProperties() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Properties");
            return new SettingsPropertyCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SettingsPropertyValueCollection getPropertyValues() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PropertyValues");
            return new SettingsPropertyValueCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SettingsProviderCollection getProviders() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Providers");
            return new SettingsProviderCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSettingsKey() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SettingsKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSettingsKey(java.lang.String SettingsKey) throws Throwable {
        try {
            classInstance.Set("SettingsKey", (Object)SettingsKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSynchronized() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSynchronized");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addPropertyChanged(PropertyChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PropertyChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePropertyChanged(PropertyChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PropertyChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addSettingChanging(SettingChangingEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("SettingChanging", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeSettingChanging(SettingChangingEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("SettingChanging", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addSettingsLoaded(SettingsLoadedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("SettingsLoaded", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeSettingsLoaded(SettingsLoadedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("SettingsLoaded", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addSettingsSaving(SettingsSavingEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("SettingsSaving", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeSettingsSaving(SettingsSavingEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("SettingsSaving", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}