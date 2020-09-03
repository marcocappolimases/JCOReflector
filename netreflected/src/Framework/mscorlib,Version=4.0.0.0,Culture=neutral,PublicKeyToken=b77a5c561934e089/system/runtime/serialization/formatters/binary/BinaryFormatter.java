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

package system.runtime.serialization.formatters.binary;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.runtime.serialization.ISurrogateSelector;
import system.runtime.serialization.ISurrogateSelectorImplementation;
import system.runtime.serialization.StreamingContext;
import system.io.Stream;
import system.runtime.remoting.messaging.HeaderHandler;
import system.runtime.remoting.messaging.IMethodCallMessage;
import system.runtime.remoting.messaging.IMethodCallMessageImplementation;
import system.runtime.remoting.messaging.Header;
import system.runtime.serialization.formatters.FormatterAssemblyStyle;
import system.runtime.serialization.formatters.FormatterTypeStyle;
import system.runtime.serialization.formatters.TypeFilterLevel;
import system.runtime.serialization.SerializationBinder;


/**
 * The base .NET class managing System.Runtime.Serialization.Formatters.Binary.BinaryFormatter, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Serialization.Formatters.Binary.BinaryFormatter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Serialization.Formatters.Binary.BinaryFormatter</a>
 */
public class BinaryFormatter extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Runtime.Serialization.Formatters.Binary.BinaryFormatter
     */
    public static final String className = "System.Runtime.Serialization.Formatters.Binary.BinaryFormatter";
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

    public BinaryFormatter(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link BinaryFormatter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link BinaryFormatter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static BinaryFormatter cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new BinaryFormatter(from.getJCOInstance());
    }

    // Constructors section
    
    public BinaryFormatter() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BinaryFormatter(ISurrogateSelector selector, StreamingContext context) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(selector == null ? null : selector.getJCOInstance(), context == null ? null : context.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public NetObject Deserialize(Stream serializationStream) throws Throwable, system.ArgumentNullException, system.FormatException, system.runtime.serialization.SerializationException, system.ArgumentException, system.io.EndOfStreamException, system.ObjectDisposedException, system.runtime.remoting.RemotingException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDeserialize = (JCObject)classInstance.Invoke("Deserialize", serializationStream == null ? null : serializationStream.getJCOInstance());
            return new NetObject(objDeserialize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Deserialize(Stream serializationStream, HeaderHandler handler) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.runtime.serialization.SerializationException, system.io.EndOfStreamException, system.io.IOException, system.NullReferenceException, system.runtime.remoting.RemotingException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDeserialize = (JCObject)classInstance.Invoke("Deserialize", serializationStream == null ? null : serializationStream.getJCOInstance(), handler);
            return new NetObject(objDeserialize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject DeserializeMethodResponse(Stream serializationStream, HeaderHandler handler, IMethodCallMessage methodCallMessage) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.EndOfStreamException, system.io.IOException, system.MissingMemberException, system.NotSupportedException, system.runtime.remoting.RemotingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDeserializeMethodResponse = (JCObject)classInstance.Invoke("DeserializeMethodResponse", serializationStream == null ? null : serializationStream.getJCOInstance(), handler, methodCallMessage == null ? null : methodCallMessage.getJCOInstance());
            return new NetObject(objDeserializeMethodResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject UnsafeDeserialize(Stream serializationStream, HeaderHandler handler) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.runtime.serialization.SerializationException, system.io.EndOfStreamException, system.io.IOException, system.NullReferenceException, system.runtime.remoting.RemotingException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objUnsafeDeserialize = (JCObject)classInstance.Invoke("UnsafeDeserialize", serializationStream == null ? null : serializationStream.getJCOInstance(), handler);
            return new NetObject(objUnsafeDeserialize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject UnsafeDeserializeMethodResponse(Stream serializationStream, HeaderHandler handler, IMethodCallMessage methodCallMessage) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.EndOfStreamException, system.io.IOException, system.MissingMemberException, system.NotSupportedException, system.runtime.remoting.RemotingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objUnsafeDeserializeMethodResponse = (JCObject)classInstance.Invoke("UnsafeDeserializeMethodResponse", serializationStream == null ? null : serializationStream.getJCOInstance(), handler, methodCallMessage == null ? null : methodCallMessage.getJCOInstance());
            return new NetObject(objUnsafeDeserializeMethodResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Serialize(Stream serializationStream, NetObject graph) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.MulticastNotSupportedException, system.NotImplementedException, system.security.SecurityException, system.reflection.TargetException, system.NullReferenceException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Serialize", serializationStream == null ? null : serializationStream.getJCOInstance(), graph == null ? null : graph.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Serialize(Stream serializationStream, NetObject graph, Header[] headers) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.MulticastNotSupportedException, system.NotImplementedException, system.security.SecurityException, system.reflection.TargetException, system.NullReferenceException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Serialize", serializationStream == null ? null : serializationStream.getJCOInstance(), graph == null ? null : graph.getJCOInstance(), toObjectFromArray(headers));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public FormatterAssemblyStyle getAssemblyFormat() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AssemblyFormat");
            return new FormatterAssemblyStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAssemblyFormat(FormatterAssemblyStyle AssemblyFormat) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AssemblyFormat", AssemblyFormat == null ? null : AssemblyFormat.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FormatterTypeStyle getTypeFormat() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TypeFormat");
            return new FormatterTypeStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTypeFormat(FormatterTypeStyle TypeFormat) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TypeFormat", TypeFormat == null ? null : TypeFormat.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeFilterLevel getFilterLevel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("FilterLevel");
            return new TypeFilterLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFilterLevel(TypeFilterLevel FilterLevel) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FilterLevel", FilterLevel == null ? null : FilterLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISurrogateSelector getSurrogateSelector() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SurrogateSelector");
            return new ISurrogateSelectorImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSurrogateSelector(ISurrogateSelector SurrogateSelector) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SurrogateSelector", SurrogateSelector == null ? null : SurrogateSelector.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SerializationBinder getBinder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Binder");
            return new SerializationBinder(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBinder(SerializationBinder Binder) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Binder", Binder == null ? null : Binder.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StreamingContext getContext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Context");
            return new StreamingContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContext(StreamingContext Context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Context", Context == null ? null : Context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}