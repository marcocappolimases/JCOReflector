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

package system.reflection;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.EventInfo;
import system.reflection.FieldInfo;
import system.reflection.InterfaceMapping;
import system.reflection.TypeInfo;
import system.reflection.MethodInfo;
import system.reflection.PropertyInfo;


/**
 * The base .NET class managing System.Reflection.RuntimeReflectionExtensions, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.RuntimeReflectionExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.RuntimeReflectionExtensions</a>
 */
public class RuntimeReflectionExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Reflection.RuntimeReflectionExtensions
     */
    public static final String className = "System.Reflection.RuntimeReflectionExtensions";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
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

    public RuntimeReflectionExtensions(Object instance) throws Throwable {
        super(instance);
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

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RuntimeReflectionExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RuntimeReflectionExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RuntimeReflectionExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RuntimeReflectionExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public RuntimeReflectionExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static EventInfo GetRuntimeEvent(NetType type, java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetRuntimeEvent = (JCObject)classType.Invoke("GetRuntimeEvent", type == null ? null : type.getJCOInstance(), name);
            return new EventInfo(objGetRuntimeEvent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FieldInfo GetRuntimeField(NetType type, java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetRuntimeField = (JCObject)classType.Invoke("GetRuntimeField", type == null ? null : type.getJCOInstance(), name);
            return new FieldInfo(objGetRuntimeField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static InterfaceMapping GetRuntimeInterfaceMap(TypeInfo typeInfo, NetType interfaceType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetRuntimeInterfaceMap = (JCObject)classType.Invoke("GetRuntimeInterfaceMap", typeInfo == null ? null : typeInfo.getJCOInstance(), interfaceType == null ? null : interfaceType.getJCOInstance());
            return new InterfaceMapping(objGetRuntimeInterfaceMap);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MethodInfo GetRuntimeBaseDefinition(MethodInfo method) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetRuntimeBaseDefinition = (JCObject)classType.Invoke("GetRuntimeBaseDefinition", method == null ? null : method.getJCOInstance());
            return new MethodInfo(objGetRuntimeBaseDefinition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MethodInfo GetRuntimeMethod(NetType type, java.lang.String name, NetType[] parameters) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetRuntimeMethod = (JCObject)classType.Invoke("GetRuntimeMethod", type == null ? null : type.getJCOInstance(), name, toObjectFromArray(parameters));
            return new MethodInfo(objGetRuntimeMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PropertyInfo GetRuntimeProperty(NetType type, java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetRuntimeProperty = (JCObject)classType.Invoke("GetRuntimeProperty", type == null ? null : type.getJCOInstance(), name);
            return new PropertyInfo(objGetRuntimeProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}