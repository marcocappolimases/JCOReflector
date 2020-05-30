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

package system.reflection.portableexecutable;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.UInt32;
import system.UInt16;
import system.reflection.portableexecutable.DebugDirectoryEntryType;


/**
 * The base .NET class managing System.Reflection.PortableExecutable.DebugDirectoryEntry, System.Reflection.Metadata, Version=1.4.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class DebugDirectoryEntry extends NetObject  {
    public static final String assemblyFullName = "System.Reflection.Metadata, Version=1.4.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Reflection.Metadata";
    public static final String className = "System.Reflection.PortableExecutable.DebugDirectoryEntry";
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

    public DebugDirectoryEntry(Object instance) throws Throwable {
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

    public static DebugDirectoryEntry castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DebugDirectoryEntry(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DebugDirectoryEntry(UInt32 stamp, UInt16 majorVersion, UInt16 minorVersion, DebugDirectoryEntryType type, int dataSize, int dataRelativeVirtualAddress, int dataPointer) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)stamp.getJCOInstance(), (Object)majorVersion.getJCOInstance(), (Object)minorVersion.getJCOInstance(), (Object)type.getJCOInstance(), dataSize, dataRelativeVirtualAddress, dataPointer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public UInt32 getStamp() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Stamp");
            return new UInt32(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getMajorVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MajorVersion");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getMinorVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MinorVersion");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DebugDirectoryEntryType getType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Type");
            return new DebugDirectoryEntryType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDataSize() throws Throwable {
        try {
            return (int)classInstance.Get("DataSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDataRelativeVirtualAddress() throws Throwable {
        try {
            return (int)classInstance.Get("DataRelativeVirtualAddress");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDataPointer() throws Throwable {
        try {
            return (int)classInstance.Get("DataPointer");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsPortableCodeView() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsPortableCodeView");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}