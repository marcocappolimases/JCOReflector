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

package system.drawing.imaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.drawing.imaging.MetafileType;
import system.Single;
import system.drawing.Rectangle;
import system.drawing.imaging.MetaHeader;


/**
 * The base .NET class managing System.Drawing.Imaging.MetafileHeader, System.Drawing.Common, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class MetafileHeader extends NetObject  {
    public static final String assemblyFullName = "System.Drawing.Common, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
	public static final String assemblyShortName = "System.Drawing.Common";
    public static final String className = "System.Drawing.Imaging.MetafileHeader";
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

    public MetafileHeader(Object instance) throws Throwable {
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

    public static MetafileHeader castFrom(IJCOBridgeReflected from) throws Throwable {
        return new MetafileHeader(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public boolean IsWmf() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsWmf");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsWmfPlaceable() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsWmfPlaceable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEmf() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsEmf");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEmfOrEmfPlus() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsEmfOrEmfPlus");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEmfPlus() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsEmfPlus");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEmfPlusDual() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsEmfPlusDual");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEmfPlusOnly() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsEmfPlusOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDisplay() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            return (boolean)classInstance.Invoke("IsDisplay");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public MetafileType getType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Type");
            return new MetafileType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMetafileSize() throws Throwable {
        try {
            return (int)classInstance.Get("MetafileSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getVersion() throws Throwable {
        try {
            return (int)classInstance.Get("Version");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single getDpiX() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DpiX");
            return new Single(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single getDpiY() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DpiY");
            return new Single(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle getBounds() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Bounds");
            return new Rectangle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MetaHeader getWmfHeader() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WmfHeader");
            return new MetaHeader(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getEmfPlusHeaderSize() throws Throwable {
        try {
            return (int)classInstance.Get("EmfPlusHeaderSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLogicalDpiX() throws Throwable {
        try {
            return (int)classInstance.Get("LogicalDpiX");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLogicalDpiY() throws Throwable {
        try {
            return (int)classInstance.Get("LogicalDpiY");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}