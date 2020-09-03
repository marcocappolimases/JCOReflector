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

package system.security.policy;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.NamedPermissionSet;
import system.security.PermissionSet;
import system.security.policy.CodeGroup;
import system.security.policy.Evidence;
import system.security.policy.PolicyLevel;
import system.security.policy.PolicyStatement;
import system.security.SecurityElement;
import system.security.policy.StrongName;
import system.security.policy.StrongNameMembershipCondition;
import system.collections.IList;
import system.collections.IListImplementation;
import system.security.PolicyLevelType;


/**
 * The base .NET class managing System.Security.Policy.PolicyLevel, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.Policy.PolicyLevel" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.Policy.PolicyLevel</a>
 */
public class PolicyLevel extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Security.Policy.PolicyLevel
     */
    public static final String className = "System.Security.Policy.PolicyLevel";
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

    public PolicyLevel(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PolicyLevel}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PolicyLevel} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PolicyLevel cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PolicyLevel(from.getJCOInstance());
    }

    // Constructors section
    
    public PolicyLevel() throws Throwable {
    }



    
    // Methods section
    
    public NamedPermissionSet ChangeNamedPermissionSet(java.lang.String name, PermissionSet pSet) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.security.SecurityException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.security.XmlSyntaxException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objChangeNamedPermissionSet = (JCObject)classInstance.Invoke("ChangeNamedPermissionSet", name, pSet == null ? null : pSet.getJCOInstance());
            return new NamedPermissionSet(objChangeNamedPermissionSet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NamedPermissionSet GetNamedPermissionSet(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.NullReferenceException, system.security.XmlSyntaxException, system.ObjectDisposedException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetNamedPermissionSet = (JCObject)classInstance.Invoke("GetNamedPermissionSet", name);
            return new NamedPermissionSet(objGetNamedPermissionSet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NamedPermissionSet RemoveNamedPermissionSet(NamedPermissionSet permSet) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.NullReferenceException, system.security.XmlSyntaxException, system.ObjectDisposedException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRemoveNamedPermissionSet = (JCObject)classInstance.Invoke("RemoveNamedPermissionSet", permSet == null ? null : permSet.getJCOInstance());
            return new NamedPermissionSet(objRemoveNamedPermissionSet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NamedPermissionSet RemoveNamedPermissionSet(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.NullReferenceException, system.security.XmlSyntaxException, system.OutOfMemoryException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRemoveNamedPermissionSet = (JCObject)classInstance.Invoke("RemoveNamedPermissionSet", name);
            return new NamedPermissionSet(objRemoveNamedPermissionSet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CodeGroup ResolveMatchingCodeGroups(Evidence evidence) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.NullReferenceException, system.security.XmlSyntaxException, system.ObjectDisposedException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objResolveMatchingCodeGroups = (JCObject)classInstance.Invoke("ResolveMatchingCodeGroups", evidence == null ? null : evidence.getJCOInstance());
            return new CodeGroup(objResolveMatchingCodeGroups);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PolicyLevel CreateAppDomainLevel() throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateAppDomainLevel = (JCObject)classType.Invoke("CreateAppDomainLevel");
            return new PolicyLevel(objCreateAppDomainLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PolicyStatement Resolve(Evidence evidence) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.security.XmlSyntaxException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.InvalidCastException, system.NotSupportedException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.security.policy.PolicyException, system.runtime.serialization.SerializationException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objResolve = (JCObject)classInstance.Invoke("Resolve", evidence == null ? null : evidence.getJCOInstance());
            return new PolicyStatement(objResolve);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityElement ToXml() throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.NullReferenceException, system.security.XmlSyntaxException, system.OutOfMemoryException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToXml = (JCObject)classInstance.Invoke("ToXml");
            return new SecurityElement(objToXml);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddFullTrustAssembly(StrongName sn) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.security.XmlSyntaxException, system.ObjectDisposedException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddFullTrustAssembly", sn == null ? null : sn.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddFullTrustAssembly(StrongNameMembershipCondition snMC) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.NullReferenceException, system.security.XmlSyntaxException, system.OutOfMemoryException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddFullTrustAssembly", snMC == null ? null : snMC.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddNamedPermissionSet(NamedPermissionSet permSet) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.NullReferenceException, system.security.XmlSyntaxException, system.OutOfMemoryException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddNamedPermissionSet", permSet == null ? null : permSet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void FromXml(SecurityElement e) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.NullReferenceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.RankException, system.security.XmlSyntaxException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("FromXml", e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Recover() throws Throwable, system.security.policy.PolicyException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Recover");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveFullTrustAssembly(StrongName sn) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.security.XmlSyntaxException, system.ObjectDisposedException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveFullTrustAssembly", sn == null ? null : sn.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveFullTrustAssembly(StrongNameMembershipCondition snMC) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.NullReferenceException, system.security.XmlSyntaxException, system.OutOfMemoryException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveFullTrustAssembly", snMC == null ? null : snMC.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Reset() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotImplementedException, system.security.SecurityException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IList getFullTrustAssemblies() throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.NullReferenceException, system.security.XmlSyntaxException, system.OutOfMemoryException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("FullTrustAssemblies");
            return new IListImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IList getNamedPermissionSets() throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.NullReferenceException, system.security.XmlSyntaxException, system.OutOfMemoryException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NamedPermissionSets");
            return new IListImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CodeGroup getRootCodeGroup() throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.NullReferenceException, system.security.XmlSyntaxException, system.OutOfMemoryException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RootCodeGroup");
            return new CodeGroup(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRootCodeGroup(CodeGroup RootCodeGroup) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.NullReferenceException, system.security.XmlSyntaxException, system.OutOfMemoryException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RootCodeGroup", RootCodeGroup == null ? null : RootCodeGroup.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PolicyLevelType getType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Type");
            return new PolicyLevelType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getLabel() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Label");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getStoreLocation() throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("StoreLocation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}