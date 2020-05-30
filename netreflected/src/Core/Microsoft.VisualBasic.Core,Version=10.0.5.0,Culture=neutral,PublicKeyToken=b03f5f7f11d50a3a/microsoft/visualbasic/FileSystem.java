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

package microsoft.visualbasic;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.visualbasic.TabInfo;
import microsoft.visualbasic.SpcInfo;
import microsoft.visualbasic.OpenMode;
import microsoft.visualbasic.FileAttribute;
import system.DateTime;
import microsoft.visualbasic.OpenAccess;
import microsoft.visualbasic.OpenShare;
import system.ValueType;
import system.Array;
import system.Single;
import system.Decimal;


/**
 * The base .NET class managing Microsoft.VisualBasic.FileSystem, Microsoft.VisualBasic.Core, Version=10.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class FileSystem extends NetObject  {
    public static final String assemblyFullName = "Microsoft.VisualBasic.Core, Version=10.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.VisualBasic.Core";
    public static final String className = "Microsoft.VisualBasic.FileSystem";
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

    public FileSystem(Object instance) throws Throwable {
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

    public static FileSystem castFrom(IJCOBridgeReflected from) throws Throwable {
        return new FileSystem(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static TabInfo TAB() throws Throwable {
        try {
            JCObject objTAB = (JCObject)classType.Invoke("TAB");
            return new TabInfo(objTAB);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TabInfo TAB(short Column) throws Throwable {
        try {
            JCObject objTAB = (JCObject)classType.Invoke("TAB", Column);
            return new TabInfo(objTAB);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SpcInfo SPC(short Count) throws Throwable {
        try {
            JCObject objSPC = (JCObject)classType.Invoke("SPC", Count);
            return new SpcInfo(objSPC);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static OpenMode FileAttr(int FileNumber) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException {
        try {
            JCObject objFileAttr = (JCObject)classType.Invoke("FileAttr", FileNumber);
            return new OpenMode(objFileAttr);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Reset() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.security.SecurityException, system.InvalidOperationException {
        try {
            classType.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Rename(java.lang.String OldPath, java.lang.String NewPath) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.security.SecurityException, system.InvalidOperationException, system.IndexOutOfRangeException {
        try {
            classType.Invoke("Rename", (Object)OldPath, (Object)NewPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ChDir(java.lang.String Path) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ArrayTypeMismatchException, system.NotSupportedException {
        try {
            classType.Invoke("ChDir", (Object)Path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ChDrive(char Drive) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            classType.Invoke("ChDrive", Drive);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ChDrive(java.lang.String Drive) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            classType.Invoke("ChDrive", (Object)Drive);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String CurDir() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        try {
            return (java.lang.String)classType.Invoke("CurDir");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String CurDir(char Drive) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            return (java.lang.String)classType.Invoke("CurDir", Drive);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Dir() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.security.SecurityException, system.InvalidOperationException, system.IndexOutOfRangeException {
        try {
            return (java.lang.String)classType.Invoke("Dir");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Dir(java.lang.String PathName, FileAttribute Attributes) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException, system.security.SecurityException {
        try {
            return (java.lang.String)classType.Invoke("Dir", (Object)PathName, (Object)Attributes.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void MkDir(java.lang.String Path) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.ArrayTypeMismatchException, system.FormatException {
        try {
            classType.Invoke("MkDir", (Object)Path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RmDir(java.lang.String Path) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.ArrayTypeMismatchException, system.io.IOException {
        try {
            classType.Invoke("RmDir", (Object)Path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FileCopy(java.lang.String Source, java.lang.String Destination) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.security.SecurityException, system.ArrayTypeMismatchException, system.io.IOException {
        try {
            classType.Invoke("FileCopy", (Object)Source, (Object)Destination);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime FileDateTime(java.lang.String PathName) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArrayTypeMismatchException, system.io.FileNotFoundException {
        try {
            JCObject objFileDateTime = (JCObject)classType.Invoke("FileDateTime", (Object)PathName);
            return new DateTime(objFileDateTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long FileLen(java.lang.String PathName) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.io.FileNotFoundException {
        try {
            return (long)classType.Invoke("FileLen", (Object)PathName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileAttribute GetAttr(java.lang.String PathName) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException, system.io.FileNotFoundException {
        try {
            JCObject objGetAttr = (JCObject)classType.Invoke("GetAttr", (Object)PathName);
            return new FileAttribute(objGetAttr);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Kill(java.lang.String PathName) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.FormatException, system.ArrayTypeMismatchException, system.NotSupportedException, system.OutOfMemoryException, system.security.SecurityException, system.io.FileNotFoundException {
        try {
            classType.Invoke("Kill", (Object)PathName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetAttr(java.lang.String PathName, FileAttribute Attributes) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.security.SecurityException, system.InvalidOperationException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        try {
            classType.Invoke("SetAttr", (Object)PathName, (Object)Attributes.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FileOpen(int FileNumber, java.lang.String FileName, OpenMode Mode, OpenAccess Access, OpenShare Share, int RecordLength) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException, system.security.SecurityException, system.NotSupportedException, system.runtime.serialization.SerializationException, system.io.IOException {
        try {
            classType.Invoke("FileOpen", FileNumber, (Object)FileName, (Object)Mode.getJCOInstance(), (Object)Access.getJCOInstance(), (Object)Share.getJCOInstance(), RecordLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FileClose(int... FileNumbers) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.security.SecurityException, system.InvalidOperationException {
        try {
            classType.Invoke("FileClose", FileNumbers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FilePutObject(int FileNumber, NetObject Value, long RecordNumber) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.security.SecurityException {
        try {
            classType.Invoke("FilePutObject", FileNumber, (Object)Value.getJCOInstance(), RecordNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FilePut(NetObject FileNumber, NetObject Value, NetObject RecordNumber) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        try {
            classType.Invoke("FilePut", (Object)FileNumber.getJCOInstance(), (Object)Value.getJCOInstance(), (Object)RecordNumber.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FilePut(int FileNumber, ValueType Value, long RecordNumber) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.security.SecurityException {
        try {
            classType.Invoke("FilePut", FileNumber, (Object)Value.getJCOInstance(), RecordNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FilePut(int FileNumber, Array Value, long RecordNumber, boolean ArrayIsDynamic, boolean StringIsFixedLength) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.security.SecurityException {
        try {
            classType.Invoke("FilePut", FileNumber, (Object)Value.getJCOInstance(), RecordNumber, ArrayIsDynamic, StringIsFixedLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FilePut(int FileNumber, boolean Value, long RecordNumber) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.security.SecurityException {
        try {
            classType.Invoke("FilePut", FileNumber, Value, RecordNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FilePut(int FileNumber, byte Value, long RecordNumber) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.security.SecurityException {
        try {
            classType.Invoke("FilePut", FileNumber, Value, RecordNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FilePut(int FileNumber, short Value, long RecordNumber) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.security.SecurityException {
        try {
            classType.Invoke("FilePut", FileNumber, Value, RecordNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FilePut(int FileNumber, int Value, long RecordNumber) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.security.SecurityException {
        try {
            classType.Invoke("FilePut", FileNumber, Value, RecordNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FilePut(int FileNumber, long Value, long RecordNumber) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.security.SecurityException {
        try {
            classType.Invoke("FilePut", FileNumber, Value, RecordNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FilePut(int FileNumber, char Value, long RecordNumber) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.security.SecurityException {
        try {
            classType.Invoke("FilePut", FileNumber, Value, RecordNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FilePut(int FileNumber, Single Value, long RecordNumber) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.security.SecurityException {
        try {
            classType.Invoke("FilePut", FileNumber, (Object)Value.getJCOInstance(), RecordNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FilePut(int FileNumber, double Value, long RecordNumber) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.security.SecurityException {
        try {
            classType.Invoke("FilePut", FileNumber, Value, RecordNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FilePut(int FileNumber, Decimal Value, long RecordNumber) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.security.SecurityException {
        try {
            classType.Invoke("FilePut", FileNumber, (Object)Value.getJCOInstance(), RecordNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FilePut(int FileNumber, java.lang.String Value, long RecordNumber, boolean StringIsFixedLength) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.security.SecurityException {
        try {
            classType.Invoke("FilePut", FileNumber, (Object)Value, RecordNumber, StringIsFixedLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FilePut(int FileNumber, DateTime Value, long RecordNumber) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.security.SecurityException {
        try {
            classType.Invoke("FilePut", FileNumber, (Object)Value.getJCOInstance(), RecordNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Print(int FileNumber, NetObject... Output) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.OverflowException, system.InvalidCastException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            classType.Invoke("Print", FileNumber, (Object[])toObjectFromArray(Output));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void PrintLine(int FileNumber, NetObject... Output) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.OverflowException, system.InvalidCastException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            classType.Invoke("PrintLine", FileNumber, (Object[])toObjectFromArray(Output));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Write(int FileNumber, NetObject... Output) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.InvalidCastException, system.NotSupportedException {
        try {
            classType.Invoke("Write", FileNumber, (Object[])toObjectFromArray(Output));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteLine(int FileNumber, NetObject... Output) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.InvalidCastException, system.NotSupportedException {
        try {
            classType.Invoke("WriteLine", FileNumber, (Object[])toObjectFromArray(Output));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String InputString(int FileNumber, int CharCount) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.security.SecurityException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.NullReferenceException, system.ObjectDisposedException, system.OverflowException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classType.Invoke("InputString", FileNumber, CharCount);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String LineInput(int FileNumber) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.NullReferenceException, system.ObjectDisposedException {
        try {
            return (java.lang.String)classType.Invoke("LineInput", FileNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Lock(int FileNumber) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException {
        try {
            classType.Invoke("Lock", FileNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Lock(int FileNumber, long Record) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException {
        try {
            classType.Invoke("Lock", FileNumber, Record);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Lock(int FileNumber, long FromRecord, long ToRecord) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException {
        try {
            classType.Invoke("Lock", FileNumber, FromRecord, ToRecord);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Unlock(int FileNumber) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException {
        try {
            classType.Invoke("Unlock", FileNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Unlock(int FileNumber, long Record) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException {
        try {
            classType.Invoke("Unlock", FileNumber, Record);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Unlock(int FileNumber, long FromRecord, long ToRecord) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException {
        try {
            classType.Invoke("Unlock", FileNumber, FromRecord, ToRecord);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FileWidth(int FileNumber, int RecordWidth) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException {
        try {
            classType.Invoke("FileWidth", FileNumber, RecordWidth);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int FreeFile() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.security.SecurityException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        try {
            return (int)classType.Invoke("FreeFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Seek(int FileNumber, long Position) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException, system.io.IOException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        try {
            classType.Invoke("Seek", FileNumber, Position);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long Seek(int FileNumber) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException {
        try {
            return (long)classType.Invoke("Seek", FileNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean EOF(int FileNumber) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException {
        try {
            return (boolean)classType.Invoke("EOF", FileNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long Loc(int FileNumber) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException {
        try {
            return (long)classType.Invoke("Loc", FileNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long LOF(int FileNumber) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException {
        try {
            return (long)classType.Invoke("LOF", FileNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}