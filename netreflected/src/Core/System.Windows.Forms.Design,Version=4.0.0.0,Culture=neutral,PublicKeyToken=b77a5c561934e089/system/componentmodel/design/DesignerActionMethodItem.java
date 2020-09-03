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

package system.componentmodel.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.design.DesignerActionItem;
import system.componentmodel.design.DesignerActionList;
import system.componentmodel.IComponent;
import system.componentmodel.IComponentImplementation;


/**
 * The base .NET class managing System.ComponentModel.Design.DesignerActionMethodItem, System.Windows.Forms.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ComponentModel.Design.DesignerActionMethodItem" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ComponentModel.Design.DesignerActionMethodItem</a>
 */
public class DesignerActionMethodItem extends DesignerActionItem  {
    /**
     * Fully assembly qualified name: System.Windows.Forms.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms.Design
     */
    public static final String assemblyShortName = "System.Windows.Forms.Design";
    /**
     * Qualified class name: System.ComponentModel.Design.DesignerActionMethodItem
     */
    public static final String className = "System.ComponentModel.Design.DesignerActionMethodItem";
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

    public DesignerActionMethodItem(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DesignerActionMethodItem}, a cast assert is made to check if types are compatible.
	 * @param {@link IJCOBridgeReflected} instance to be casted
	 * @return {@link DesignerActionMethodItem} instance
	 * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DesignerActionMethodItem cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DesignerActionMethodItem(from.getJCOInstance());
    }

    // Constructors section
    
    public DesignerActionMethodItem() throws Throwable {
    }

    public DesignerActionMethodItem(DesignerActionList actionList, java.lang.String memberName, java.lang.String displayName) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(actionList == null ? null : actionList.getJCOInstance(), memberName, displayName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerActionMethodItem(DesignerActionList actionList, java.lang.String memberName, java.lang.String displayName, boolean includeAsDesignerVerb) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(actionList == null ? null : actionList.getJCOInstance(), memberName, displayName, includeAsDesignerVerb));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerActionMethodItem(DesignerActionList actionList, java.lang.String memberName, java.lang.String displayName, java.lang.String category) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(actionList == null ? null : actionList.getJCOInstance(), memberName, displayName, category));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerActionMethodItem(DesignerActionList actionList, java.lang.String memberName, java.lang.String displayName, java.lang.String category, boolean includeAsDesignerVerb) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(actionList == null ? null : actionList.getJCOInstance(), memberName, displayName, category, includeAsDesignerVerb));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerActionMethodItem(DesignerActionList actionList, java.lang.String memberName, java.lang.String displayName, java.lang.String category, java.lang.String description) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(actionList == null ? null : actionList.getJCOInstance(), memberName, displayName, category, description));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerActionMethodItem(DesignerActionList actionList, java.lang.String memberName, java.lang.String displayName, java.lang.String category, java.lang.String description, boolean includeAsDesignerVerb) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(actionList == null ? null : actionList.getJCOInstance(), memberName, displayName, category, description, includeAsDesignerVerb));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public void Invoke() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Invoke");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIncludeAsDesignerVerb() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IncludeAsDesignerVerb");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IComponent getRelatedComponent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RelatedComponent");
            return new IComponentImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRelatedComponent(IComponent RelatedComponent) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RelatedComponent", RelatedComponent == null ? null : RelatedComponent.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMemberName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("MemberName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}