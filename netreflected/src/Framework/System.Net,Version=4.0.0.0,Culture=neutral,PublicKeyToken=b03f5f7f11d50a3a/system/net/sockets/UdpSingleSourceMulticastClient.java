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

package system.net.sockets;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.net.IPAddress;
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.AsyncCallback;


/**
 * The base .NET class managing System.Net.Sockets.UdpSingleSourceMulticastClient, System.Net, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.Sockets.UdpSingleSourceMulticastClient" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.Sockets.UdpSingleSourceMulticastClient</a>
 */
public class UdpSingleSourceMulticastClient extends NetObjectAutoCloseable  {
    /**
     * Fully assembly qualified name: System.Net, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Net, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Net
     */
    public static final String assemblyShortName = "System.Net";
    /**
     * Qualified class name: System.Net.Sockets.UdpSingleSourceMulticastClient
     */
    public static final String className = "System.Net.Sockets.UdpSingleSourceMulticastClient";
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

    public UdpSingleSourceMulticastClient(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link UdpSingleSourceMulticastClient}, a cast assert is made to check if types are compatible.
     */
    public static UdpSingleSourceMulticastClient cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new UdpSingleSourceMulticastClient(from.getJCOInstance());
    }

    // Constructors section
    
    public UdpSingleSourceMulticastClient() throws Throwable {
    }

    public UdpSingleSourceMulticastClient(IPAddress sourceAddress, IPAddress groupAddress, int localPort) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(sourceAddress == null ? null : sourceAddress.getJCOInstance(), groupAddress == null ? null : groupAddress.getJCOInstance(), localPort));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public IAsyncResult BeginJoinGroup(AsyncCallback callback, NetObject state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.net.sockets.SocketException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginJoinGroup = (JCObject)classInstance.Invoke("BeginJoinGroup", callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginJoinGroup);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginReceiveFromSource(byte[] buffer, int offset, int count, AsyncCallback callback, NetObject state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.net.sockets.SocketException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginReceiveFromSource = (JCObject)classInstance.Invoke("BeginReceiveFromSource", buffer, offset, count, callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginReceiveFromSource);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginReceiveFromSource(JCRefOut dupParam0, int dupParam1, int dupParam2, AsyncCallback dupParam3, NetObject dupParam4) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.net.sockets.SocketException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginReceiveFromSource = (JCObject)classInstance.Invoke("BeginReceiveFromSource", dupParam0, dupParam1, dupParam2, dupParam3, dupParam4 == null ? null : dupParam4.getJCOInstance());
            return new IAsyncResultImplementation(objBeginReceiveFromSource);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginSendToSource(byte[] buffer, int offset, int count, int remotePort, AsyncCallback callback, NetObject state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.net.sockets.SocketException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginSendToSource = (JCObject)classInstance.Invoke("BeginSendToSource", buffer, offset, count, remotePort, callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginSendToSource);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginSendToSource(JCRefOut dupParam0, int dupParam1, int dupParam2, int dupParam3, AsyncCallback dupParam4, NetObject dupParam5) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.net.sockets.SocketException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginSendToSource = (JCObject)classInstance.Invoke("BeginSendToSource", dupParam0, dupParam1, dupParam2, dupParam3, dupParam4, dupParam5 == null ? null : dupParam5.getJCOInstance());
            return new IAsyncResultImplementation(objBeginSendToSource);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndJoinGroup(IAsyncResult result) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndJoinGroup", result == null ? null : result.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndSendToSource(IAsyncResult result) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndSendToSource", result == null ? null : result.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public int getReceiveBufferSize() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("ReceiveBufferSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReceiveBufferSize(int ReceiveBufferSize) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ReceiveBufferSize", ReceiveBufferSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSendBufferSize() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("SendBufferSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSendBufferSize(int SendBufferSize) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SendBufferSize", SendBufferSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}