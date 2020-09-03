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

package system.security.accesscontrol;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.accesscontrol.AccessControlModification;
import system.security.accesscontrol.AccessRule;
import system.security.accesscontrol.AuditRule;
import system.security.principal.IdentityReference;
import system.security.accesscontrol.InheritanceFlags;
import system.security.accesscontrol.PropagationFlags;
import system.security.accesscontrol.AccessControlType;
import system.security.accesscontrol.AuditFlags;
import system.security.accesscontrol.AccessControlSections;


/**
 * The base .NET class managing System.Security.AccessControl.ObjectSecurity, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.AccessControl.ObjectSecurity" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.AccessControl.ObjectSecurity</a>
 */
public class ObjectSecurity extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Security.AccessControl.ObjectSecurity
     */
    public static final String className = "System.Security.AccessControl.ObjectSecurity";
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

    public ObjectSecurity(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ObjectSecurity}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ObjectSecurity} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ObjectSecurity cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ObjectSecurity(from.getJCOInstance());
    }

    // Constructors section
    
    public ObjectSecurity() throws Throwable {
    }

    
    // Methods section
    
    public static boolean IsSddlConversionSupported() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsSddlConversionSupported");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetSecurityDescriptorBinaryForm() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetSecurityDescriptorBinaryForm");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetSecurityDescriptorBinaryForm = 0; indexGetSecurityDescriptorBinaryForm < resultingArrayList.size(); indexGetSecurityDescriptorBinaryForm++ ) {
				resultingArray[indexGetSecurityDescriptorBinaryForm] = (byte)resultingArrayList.get(indexGetSecurityDescriptorBinaryForm);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AccessRule AccessRuleFactory(IdentityReference identityReference, int accessMask, boolean isInherited, InheritanceFlags inheritanceFlags, PropagationFlags propagationFlags, AccessControlType type) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAccessRuleFactory = (JCObject)classInstance.Invoke("AccessRuleFactory", identityReference == null ? null : identityReference.getJCOInstance(), accessMask, isInherited, inheritanceFlags == null ? null : inheritanceFlags.getJCOInstance(), propagationFlags == null ? null : propagationFlags.getJCOInstance(), type == null ? null : type.getJCOInstance());
            return new AccessRule(objAccessRuleFactory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuditRule AuditRuleFactory(IdentityReference identityReference, int accessMask, boolean isInherited, InheritanceFlags inheritanceFlags, PropagationFlags propagationFlags, AuditFlags flags) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAuditRuleFactory = (JCObject)classInstance.Invoke("AuditRuleFactory", identityReference == null ? null : identityReference.getJCOInstance(), accessMask, isInherited, inheritanceFlags == null ? null : inheritanceFlags.getJCOInstance(), propagationFlags == null ? null : propagationFlags.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
            return new AuditRule(objAuditRuleFactory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IdentityReference GetGroup(NetType targetType) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetGroup = (JCObject)classInstance.Invoke("GetGroup", targetType == null ? null : targetType.getJCOInstance());
            return new IdentityReference(objGetGroup);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IdentityReference GetOwner(NetType targetType) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetOwner = (JCObject)classInstance.Invoke("GetOwner", targetType == null ? null : targetType.getJCOInstance());
            return new IdentityReference(objGetOwner);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetSecurityDescriptorSddlForm(AccessControlSections includeSections) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetSecurityDescriptorSddlForm", includeSections == null ? null : includeSections.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PurgeAccessRules(IdentityReference identity) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PurgeAccessRules", identity == null ? null : identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PurgeAuditRules(IdentityReference identity) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PurgeAuditRules", identity == null ? null : identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAccessRuleProtection(boolean isProtected, boolean preserveInheritance) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetAccessRuleProtection", isProtected, preserveInheritance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAuditRuleProtection(boolean isProtected, boolean preserveInheritance) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetAuditRuleProtection", isProtected, preserveInheritance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetGroup(IdentityReference identity) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetGroup", identity == null ? null : identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetOwner(IdentityReference identity) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetOwner", identity == null ? null : identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorBinaryForm(byte[] binaryForm) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.SystemException, system.OverflowException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSecurityDescriptorBinaryForm", (Object)binaryForm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorBinaryForm(JCRefOut dupParam0) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.SystemException, system.OverflowException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSecurityDescriptorBinaryForm", (Object)dupParam0);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorBinaryForm(byte[] binaryForm, AccessControlSections includeSections) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.SystemException, system.OverflowException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSecurityDescriptorBinaryForm", binaryForm, includeSections == null ? null : includeSections.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorBinaryForm(JCRefOut dupParam0, AccessControlSections dupParam1) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.SystemException, system.OverflowException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSecurityDescriptorBinaryForm", dupParam0, dupParam1 == null ? null : dupParam1.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorSddlForm(java.lang.String sddlForm) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.SystemException, system.ArgumentOutOfRangeException, system.FormatException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSecurityDescriptorSddlForm", sddlForm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorSddlForm(java.lang.String sddlForm, AccessControlSections includeSections) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.SystemException, system.ArgumentOutOfRangeException, system.FormatException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSecurityDescriptorSddlForm", sddlForm, includeSections == null ? null : includeSections.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getAreAccessRulesCanonical() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AreAccessRulesCanonical");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAreAccessRulesProtected() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AreAccessRulesProtected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAreAuditRulesCanonical() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AreAuditRulesCanonical");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAreAuditRulesProtected() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AreAuditRulesProtected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getAccessRightType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AccessRightType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getAccessRuleType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AccessRuleType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getAuditRuleType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AuditRuleType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}