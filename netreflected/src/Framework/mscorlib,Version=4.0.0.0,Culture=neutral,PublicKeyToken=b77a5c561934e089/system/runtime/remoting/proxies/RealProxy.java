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

package system.runtime.remoting.proxies;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.runtime.remoting.proxies.RealProxy;
import system.runtime.remoting.activation.IConstructionReturnMessage;
import system.runtime.remoting.activation.IConstructionReturnMessageImplementation;
import system.runtime.remoting.activation.IConstructionCallMessage;
import system.runtime.remoting.activation.IConstructionCallMessageImplementation;
import system.runtime.remoting.messaging.IMessage;
import system.runtime.remoting.messaging.IMessageImplementation;
import system.runtime.remoting.ObjRef;
import system.runtime.serialization.SerializationInfo;
import system.runtime.serialization.StreamingContext;


/**
 * The base .NET class managing System.Runtime.Remoting.Proxies.RealProxy, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Remoting.Proxies.RealProxy" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Remoting.Proxies.RealProxy</a>
 */
public class RealProxy extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Runtime.Remoting.Proxies.RealProxy
     */
    public static final String className = "System.Runtime.Remoting.Proxies.RealProxy";
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

    public RealProxy(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RealProxy}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RealProxy} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RealProxy cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RealProxy(from.getJCOInstance());
    }

    // Constructors section
    
    public RealProxy() throws Throwable {
    }

    
    // Methods section
    
    public static NetObject GetStubData(RealProxy rp) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetStubData = (JCObject)classType.Invoke("GetStubData", rp == null ? null : rp.getJCOInstance());
            return new NetObject(objGetStubData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetTransparentProxy() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetTransparentProxy = (JCObject)classInstance.Invoke("GetTransparentProxy");
            return new NetObject(objGetTransparentProxy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConstructionReturnMessage InitializeServerObject(IConstructionCallMessage ctorMsg) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.runtime.remoting.RemotingException, system.NullReferenceException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInitializeServerObject = (JCObject)classInstance.Invoke("InitializeServerObject", ctorMsg == null ? null : ctorMsg.getJCOInstance());
            return new IConstructionReturnMessageImplementation(objInitializeServerObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IMessage Invoke(IMessage msg) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInvoke = (JCObject)classInstance.Invoke("Invoke", msg == null ? null : msg.getJCOInstance());
            return new IMessageImplementation(objInvoke);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjRef CreateObjRef(NetType requestedType) throws Throwable, system.runtime.remoting.RemotingException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateObjRef = (JCObject)classInstance.Invoke("CreateObjRef", requestedType == null ? null : requestedType.getJCOInstance());
            return new ObjRef(objCreateObjRef);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetProxiedType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetProxiedType = (JCObject)classInstance.Invoke("GetProxiedType");
            return new NetType(objGetProxiedType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GetObjectData(SerializationInfo info, StreamingContext context) throws Throwable, system.ArgumentNullException, system.runtime.remoting.RemotingException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.runtime.serialization.SerializationException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GetObjectData", info == null ? null : info.getJCOInstance(), context == null ? null : context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetStubData(RealProxy rp, NetObject stubData) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetStubData", rp == null ? null : rp.getJCOInstance(), stubData == null ? null : stubData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}