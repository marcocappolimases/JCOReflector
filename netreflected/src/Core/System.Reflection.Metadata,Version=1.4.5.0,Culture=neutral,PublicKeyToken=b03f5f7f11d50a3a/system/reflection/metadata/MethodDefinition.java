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

package system.reflection.metadata;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.metadata.TypeDefinitionHandle;
import system.reflection.metadata.ParameterHandleCollection;
import system.reflection.metadata.GenericParameterHandleCollection;
import system.reflection.metadata.MethodImport;
import system.reflection.metadata.CustomAttributeHandleCollection;
import system.reflection.metadata.DeclarativeSecurityAttributeHandleCollection;
import system.reflection.metadata.StringHandle;
import system.reflection.metadata.BlobHandle;
import system.reflection.MethodAttributes;
import system.reflection.MethodImplAttributes;


/**
 * The base .NET class managing System.Reflection.Metadata.MethodDefinition, System.Reflection.Metadata, Version=1.4.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class MethodDefinition extends NetObject  {
    public static final String assemblyFullName = "System.Reflection.Metadata, Version=1.4.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Reflection.Metadata";
    public static final String className = "System.Reflection.Metadata.MethodDefinition";
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

    public MethodDefinition(Object instance) throws Throwable {
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

    public static MethodDefinition castFrom(IJCOBridgeReflected from) throws Throwable {
        return new MethodDefinition(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public TypeDefinitionHandle GetDeclaringType() throws Throwable, system.BadImageFormatException {
        try {
            JCObject objGetDeclaringType = (JCObject)classInstance.Invoke("GetDeclaringType");
            return new TypeDefinitionHandle(objGetDeclaringType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ParameterHandleCollection GetParameters() throws Throwable, system.BadImageFormatException {
        try {
            JCObject objGetParameters = (JCObject)classInstance.Invoke("GetParameters");
            return new ParameterHandleCollection(objGetParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GenericParameterHandleCollection GetGenericParameters() throws Throwable, system.BadImageFormatException {
        try {
            JCObject objGetGenericParameters = (JCObject)classInstance.Invoke("GetGenericParameters");
            return new GenericParameterHandleCollection(objGetGenericParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodImport GetImport() throws Throwable, system.BadImageFormatException {
        try {
            JCObject objGetImport = (JCObject)classInstance.Invoke("GetImport");
            return new MethodImport(objGetImport);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CustomAttributeHandleCollection GetCustomAttributes() throws Throwable, system.BadImageFormatException {
        try {
            JCObject objGetCustomAttributes = (JCObject)classInstance.Invoke("GetCustomAttributes");
            return new CustomAttributeHandleCollection(objGetCustomAttributes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DeclarativeSecurityAttributeHandleCollection GetDeclarativeSecurityAttributes() throws Throwable, system.BadImageFormatException {
        try {
            JCObject objGetDeclarativeSecurityAttributes = (JCObject)classInstance.Invoke("GetDeclarativeSecurityAttributes");
            return new DeclarativeSecurityAttributeHandleCollection(objGetDeclarativeSecurityAttributes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public StringHandle getName() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Name");
            return new StringHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BlobHandle getSignature() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Signature");
            return new BlobHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getRelativeVirtualAddress() throws Throwable {
        try {
            return (int)classInstance.Get("RelativeVirtualAddress");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodAttributes getAttributes() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Attributes");
            return new MethodAttributes(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodImplAttributes getImplAttributes() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ImplAttributes");
            return new MethodImplAttributes(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}