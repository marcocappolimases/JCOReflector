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

package system.xaml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xaml.XamlSchemaContext;
import system.xaml.schema.XamlTypeInvoker;
import system.xaml.XamlMember;
import system.xaml.XamlDirective;
import system.xaml.XamlType;


/**
 * The base .NET class managing System.Xaml.XamlType, System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class XamlType extends NetObject  {
    public static final String assemblyFullName = "System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Xaml";
    public static final String className = "System.Xaml.XamlType";
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

    public XamlType(Object instance) throws Throwable {
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

    public static XamlType castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XamlType(from.getJCOInstance());
    }

    // Constructors section
    
    
    public XamlType(NetType underlyingType, XamlSchemaContext schemaContext) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)underlyingType.getJCOInstance(), (Object)schemaContext.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlType(NetType underlyingType, XamlSchemaContext schemaContext, XamlTypeInvoker invoker) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)underlyingType.getJCOInstance(), (Object)schemaContext.getJCOInstance(), (Object)invoker.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public XamlMember GetAliasedProperty(XamlDirective directive) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.threading.ThreadAbortException, system.NotImplementedException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.xaml.XamlSchemaException, system.collections.generic.KeyNotFoundException {
        try {
            JCObject objGetAliasedProperty = (JCObject)classInstance.Invoke("GetAliasedProperty", (Object)directive.getJCOInstance());
            return new XamlMember(objGetAliasedProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlMember GetMember(java.lang.String name) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.threading.ThreadAbortException, system.IndexOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.NotImplementedException, system.xaml.XamlSchemaException {
        try {
            JCObject objGetMember = (JCObject)classInstance.Invoke("GetMember", (Object)name);
            return new XamlMember(objGetMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlMember GetAttachableMember(java.lang.String name) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.threading.ThreadAbortException, system.IndexOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.xaml.XamlSchemaException {
        try {
            JCObject objGetAttachableMember = (JCObject)classInstance.Invoke("GetAttachableMember", (Object)name);
            return new XamlMember(objGetAttachableMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanAssignTo(XamlType xamlType) throws Throwable, system.NotImplementedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        try {
            return (boolean)classInstance.Invoke("CanAssignTo", (Object)xamlType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(XamlType other) throws Throwable, system.ArgumentException {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public XamlType getBaseType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BaseType");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlTypeInvoker getInvoker() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Invoker");
            return new XamlTypeInvoker(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsNameValid() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsNameValid");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsUnknown() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsUnknown");
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

    public java.lang.String getPreferredXamlNamespace() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PreferredXamlNamespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getUnderlyingType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("UnderlyingType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getConstructionRequiresArguments() throws Throwable {
        try {
            return (boolean)classInstance.Get("ConstructionRequiresArguments");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsArray() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsArray");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCollection() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsCollection");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsConstructible() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsConstructible");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDictionary() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsDictionary");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsGeneric() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsGeneric");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsMarkupExtension() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsMarkupExtension");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsNameScope() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsNameScope");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsNullable() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsNullable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsPublic() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsPublic");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsUsableDuringInitialization() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsUsableDuringInitialization");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsWhitespaceSignificantCollection() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsWhitespaceSignificantCollection");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsXData() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsXData");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getTrimSurroundingWhitespace() throws Throwable {
        try {
            return (boolean)classInstance.Get("TrimSurroundingWhitespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsAmbient() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsAmbient");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlType getKeyType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("KeyType");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlType getItemType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ItemType");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlMember getContentProperty() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContentProperty");
            return new XamlMember(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlType getMarkupExtensionReturnType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MarkupExtensionReturnType");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlSchemaContext getSchemaContext() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SchemaContext");
            return new XamlSchemaContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}