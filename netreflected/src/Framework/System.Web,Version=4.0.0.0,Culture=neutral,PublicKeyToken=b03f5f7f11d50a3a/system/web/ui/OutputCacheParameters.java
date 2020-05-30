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

package system.web.ui;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.ui.OutputCacheLocation;


/**
 * The base .NET class managing System.Web.UI.OutputCacheParameters, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class OutputCacheParameters extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.UI.OutputCacheParameters";
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

    public OutputCacheParameters(Object instance) throws Throwable {
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

    public static OutputCacheParameters castFrom(IJCOBridgeReflected from) throws Throwable {
        return new OutputCacheParameters(from.getJCOInstance());
    }

    // Constructors section
    
    
    public OutputCacheParameters() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public boolean getEnabled() throws Throwable {
        try {
            return (boolean)classInstance.Get("Enabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnabled(boolean Enabled) throws Throwable {
        try {
            classInstance.Set("Enabled", Enabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDuration() throws Throwable {
        try {
            return (int)classInstance.Get("Duration");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDuration(int Duration) throws Throwable {
        try {
            classInstance.Set("Duration", Duration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OutputCacheLocation getLocation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Location");
            return new OutputCacheLocation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLocation(OutputCacheLocation Location) throws Throwable {
        try {
            classInstance.Set("Location", (Object)Location.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getVaryByCustom() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("VaryByCustom");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVaryByCustom(java.lang.String VaryByCustom) throws Throwable {
        try {
            classInstance.Set("VaryByCustom", (Object)VaryByCustom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getVaryByParam() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("VaryByParam");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVaryByParam(java.lang.String VaryByParam) throws Throwable {
        try {
            classInstance.Set("VaryByParam", (Object)VaryByParam);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getVaryByContentEncoding() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("VaryByContentEncoding");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVaryByContentEncoding(java.lang.String VaryByContentEncoding) throws Throwable {
        try {
            classInstance.Set("VaryByContentEncoding", (Object)VaryByContentEncoding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getVaryByHeader() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("VaryByHeader");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVaryByHeader(java.lang.String VaryByHeader) throws Throwable {
        try {
            classInstance.Set("VaryByHeader", (Object)VaryByHeader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getNoStore() throws Throwable {
        try {
            return (boolean)classInstance.Get("NoStore");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNoStore(boolean NoStore) throws Throwable {
        try {
            classInstance.Set("NoStore", NoStore);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSqlDependency() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SqlDependency");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSqlDependency(java.lang.String SqlDependency) throws Throwable {
        try {
            classInstance.Set("SqlDependency", (Object)SqlDependency);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getVaryByControl() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("VaryByControl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVaryByControl(java.lang.String VaryByControl) throws Throwable {
        try {
            classInstance.Set("VaryByControl", (Object)VaryByControl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCacheProfile() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CacheProfile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCacheProfile(java.lang.String CacheProfile) throws Throwable {
        try {
            classInstance.Set("CacheProfile", (Object)CacheProfile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}