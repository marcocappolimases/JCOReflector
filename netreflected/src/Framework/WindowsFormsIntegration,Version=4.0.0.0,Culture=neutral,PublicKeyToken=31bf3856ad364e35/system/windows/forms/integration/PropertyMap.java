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

package system.windows.forms.integration;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.integration.PropertyTranslator;


/**
 * The base .NET class managing System.Windows.Forms.Integration.PropertyMap, WindowsFormsIntegration, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class PropertyMap extends NetObject  {
    public static final String assemblyFullName = "WindowsFormsIntegration, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "WindowsFormsIntegration";
    public static final String className = "System.Windows.Forms.Integration.PropertyMap";
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

    public PropertyMap(Object instance) throws Throwable {
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

    public static PropertyMap castFrom(IJCOBridgeReflected from) throws Throwable {
        return new PropertyMap(from.getJCOInstance());
    }

    // Constructors section
    
    
    public PropertyMap() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyMap(NetObject source) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)source.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Add(java.lang.String propertyName, PropertyTranslator translator) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("Add", (Object)propertyName, translator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Apply(java.lang.String propertyName) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            classInstance.Invoke("Apply", (Object)propertyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ApplyAll() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException {
        try {
            classInstance.Invoke("ApplyAll");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable {
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Contains(java.lang.String propertyName) throws Throwable, system.ArgumentNullException {
        try {
            return (boolean)classInstance.Invoke("Contains", (Object)propertyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Remove(java.lang.String propertyName) throws Throwable, system.ArgumentNullException {
        try {
            classInstance.Invoke("Remove", (Object)propertyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Reset(java.lang.String propertyName) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("Reset", (Object)propertyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ResetAll() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException {
        try {
            classInstance.Invoke("ResetAll");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    


	// Instance Events section
    
    

}