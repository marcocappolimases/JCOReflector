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

package system.reflection.emit;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.ConstructorInfo;
import system.reflection.BindingFlags;
import system.reflection.Binder;
import system.globalization.CultureInfo;
import system.reflection.emit.ILGenerator;
import system.reflection.emit.MethodToken;
import system.reflection.emit.ParameterBuilder;
import system.reflection.ParameterAttributes;
import system.reflection.MethodImplAttributes;
import system.reflection.Module;
import system.reflection.ParameterInfo;
import system.security.permissions.SecurityAction;
import system.security.PermissionSet;
import system.reflection.emit.CustomAttributeBuilder;
import system.reflection.CallingConventions;
import system.reflection.MethodAttributes;
import system.RuntimeMethodHandle;


/**
 * The base .NET class managing System.Reflection.Emit.ConstructorBuilder, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Emit.ConstructorBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Emit.ConstructorBuilder</a>
 */
public class ConstructorBuilder extends ConstructorInfo  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Reflection.Emit.ConstructorBuilder
     */
    public static final String className = "System.Reflection.Emit.ConstructorBuilder";
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

    public ConstructorBuilder(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ConstructorBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ConstructorBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ConstructorBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ConstructorBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public ConstructorBuilder() throws Throwable {
    }



    
    // Methods section
    
    public boolean IsDefined(NetType attributeType, boolean inherit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsDefined", attributeType == null ? null : attributeType.getJCOInstance(), inherit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Invoke(NetObject obj, BindingFlags invokeAttr, Binder binder, NetObject[] parameters, CultureInfo culture) throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInvoke = (JCObject)classInstance.Invoke("Invoke", obj == null ? null : obj.getJCOInstance(), invokeAttr == null ? null : invokeAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(parameters), culture == null ? null : culture.getJCOInstance());
            return new NetObject(objInvoke);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Invoke(BindingFlags invokeAttr, Binder binder, NetObject[] parameters, CultureInfo culture) throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInvoke = (JCObject)classInstance.Invoke("Invoke", invokeAttr == null ? null : invokeAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(parameters), culture == null ? null : culture.getJCOInstance());
            return new NetObject(objInvoke);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject[] GetCustomAttributes(boolean inherit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetObject> resultingArrayList = new ArrayList<NetObject>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetCustomAttributes", inherit);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetObject(resultingObject));
            }
            NetObject[] resultingArray = new NetObject[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject[] GetCustomAttributes(NetType attributeType, boolean inherit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetObject> resultingArrayList = new ArrayList<NetObject>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetCustomAttributes", attributeType == null ? null : attributeType.getJCOInstance(), inherit);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetObject(resultingObject));
            }
            NetObject[] resultingArray = new NetObject[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ILGenerator GetILGenerator() throws Throwable, system.InvalidOperationException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetILGenerator = (JCObject)classInstance.Invoke("GetILGenerator");
            return new ILGenerator(objGetILGenerator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ILGenerator GetILGenerator(int streamSize) throws Throwable, system.InvalidOperationException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetILGenerator = (JCObject)classInstance.Invoke("GetILGenerator", streamSize);
            return new ILGenerator(objGetILGenerator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodToken GetToken() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetToken = (JCObject)classInstance.Invoke("GetToken");
            return new MethodToken(objGetToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ParameterBuilder DefineParameter(int iSequence, ParameterAttributes attributes, java.lang.String strParamName) throws Throwable, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineParameter = (JCObject)classInstance.Invoke("DefineParameter", iSequence, attributes == null ? null : attributes.getJCOInstance(), strParamName);
            return new ParameterBuilder(objDefineParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodImplAttributes GetMethodImplementationFlags() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetMethodImplementationFlags = (JCObject)classInstance.Invoke("GetMethodImplementationFlags");
            return new MethodImplAttributes(objGetMethodImplementationFlags);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module GetModule() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetModule = (JCObject)classInstance.Invoke("GetModule");
            return new Module(objGetModule);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ParameterInfo[] GetParameters() throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ParameterInfo> resultingArrayList = new ArrayList<ParameterInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetParameters");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ParameterInfo(resultingObject));
            }
            ParameterInfo[] resultingArray = new ParameterInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddDeclarativeSecurity(SecurityAction action, PermissionSet pset) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.NullReferenceException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddDeclarativeSecurity", action == null ? null : action.getJCOInstance(), pset == null ? null : pset.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCustomAttribute(ConstructorInfo con, byte[] binaryAttribute) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetCustomAttribute", con == null ? null : con.getJCOInstance(), binaryAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCustomAttribute(ConstructorInfo dupParam0, JCRefOut dupParam1) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetCustomAttribute", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCustomAttribute(CustomAttributeBuilder customBuilder) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetCustomAttribute", customBuilder == null ? null : customBuilder.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetImplementationFlags(MethodImplAttributes attributes) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetImplementationFlags", attributes == null ? null : attributes.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSymCustomAttribute(java.lang.String name, byte[] data) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSymCustomAttribute", name, data);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSymCustomAttribute(java.lang.String dupParam0, JCRefOut dupParam1) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSymCustomAttribute", dupParam0, dupParam1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getInitLocals() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("InitLocals");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInitLocals(boolean InitLocals) throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("InitLocals", InitLocals);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSignature() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Signature");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getReturnType() throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ReturnType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}