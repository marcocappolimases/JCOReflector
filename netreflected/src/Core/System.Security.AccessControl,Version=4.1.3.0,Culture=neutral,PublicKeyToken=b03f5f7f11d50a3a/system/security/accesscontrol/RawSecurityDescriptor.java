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

package system.security.accesscontrol;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.accesscontrol.ControlFlags;
import system.security.principal.SecurityIdentifier;
import system.security.accesscontrol.RawAcl;
import system.security.accesscontrol.AccessControlSections;


/**
 * The base .NET class managing System.Security.AccessControl.RawSecurityDescriptor, System.Security.AccessControl, Version=4.1.3.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class RawSecurityDescriptor extends NetObject  {
    public static final String assemblyFullName = "System.Security.AccessControl, Version=4.1.3.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Security.AccessControl";
    public static final String className = "System.Security.AccessControl.RawSecurityDescriptor";
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

    public RawSecurityDescriptor(Object instance) throws Throwable {
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

    public static RawSecurityDescriptor castFrom(IJCOBridgeReflected from) throws Throwable {
        return new RawSecurityDescriptor(from.getJCOInstance());
    }

    // Constructors section
    
    
    public RawSecurityDescriptor(ControlFlags flags, SecurityIdentifier owner, SecurityIdentifier group, RawAcl systemAcl, RawAcl discretionaryAcl) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)flags.getJCOInstance(), (Object)owner.getJCOInstance(), (Object)group.getJCOInstance(), (Object)systemAcl.getJCOInstance(), (Object)discretionaryAcl.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RawSecurityDescriptor(java.lang.String sddlForm) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)sddlForm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RawSecurityDescriptor(byte[] binaryForm, int offset) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(binaryForm, offset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void SetFlags(ControlFlags flags) throws Throwable {
        try {
            classInstance.Invoke("SetFlags", (Object)flags.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetSddlForm(AccessControlSections includeSections) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.InvalidOperationException {
        try {
            return (java.lang.String)classInstance.Invoke("GetSddlForm", (Object)includeSections.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GetBinaryForm(byte[] binaryForm, int offset) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("GetBinaryForm", binaryForm, offset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public ControlFlags getControlFlags() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ControlFlags");
            return new ControlFlags(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityIdentifier getOwner() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Owner");
            return new SecurityIdentifier(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOwner(SecurityIdentifier Owner) throws Throwable {
        try {
            classInstance.Set("Owner", (Object)Owner.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityIdentifier getGroup() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Group");
            return new SecurityIdentifier(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGroup(SecurityIdentifier Group) throws Throwable {
        try {
            classInstance.Set("Group", (Object)Group.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RawAcl getSystemAcl() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SystemAcl");
            return new RawAcl(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSystemAcl(RawAcl SystemAcl) throws Throwable {
        try {
            classInstance.Set("SystemAcl", (Object)SystemAcl.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RawAcl getDiscretionaryAcl() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DiscretionaryAcl");
            return new RawAcl(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDiscretionaryAcl(RawAcl DiscretionaryAcl) throws Throwable {
        try {
            classInstance.Set("DiscretionaryAcl", (Object)DiscretionaryAcl.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getResourceManagerControl() throws Throwable {
        try {
            return (byte)classInstance.Get("ResourceManagerControl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setResourceManagerControl(byte ResourceManagerControl) throws Throwable {
        try {
            classInstance.Set("ResourceManagerControl", ResourceManagerControl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getBinaryLength() throws Throwable {
        try {
            return (int)classInstance.Get("BinaryLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}