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

package system.xml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.XmlDocument;
import system.data.DataSet;
import system.data.DataRow;
import system.xml.XmlElement;
import system.xml.XmlEntityReference;
import system.xml.XmlNode;
import system.xml.XmlNodeList;
import system.io.Stream;
import system.io.TextReader;
import system.xml.XmlReader;


/**
 * The base .NET class managing System.Xml.XmlDataDocument, System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xml.XmlDataDocument" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xml.XmlDataDocument</a>
 */
public class XmlDataDocument extends XmlDocument  {
    /**
     * Fully assembly qualified name: System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Data.Common
     */
    public static final String assemblyShortName = "System.Data.Common";
    /**
     * Qualified class name: System.Xml.XmlDataDocument
     */
    public static final String className = "System.Xml.XmlDataDocument";
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

    public XmlDataDocument(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XmlDataDocument}, a cast assert is made to check if types are compatible.
	 * @param {@link IJCOBridgeReflected} instance to be casted
	 * @return {@link XmlDataDocument} instance
	 * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XmlDataDocument cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XmlDataDocument(from.getJCOInstance());
    }

    // Constructors section
    
    public XmlDataDocument() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.xml.XmlException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.data.sqltypes.SqlNullValueException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlDataDocument(DataSet dataset) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.xml.XmlException, system.threading.SynchronizationLockException, system.data.sqltypes.SqlNullValueException, system.OverflowException, system.FormatException, system.InvalidCastException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(dataset == null ? null : dataset.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public DataRow GetRowFromElement(XmlElement e) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetRowFromElement = (JCObject)classInstance.Invoke("GetRowFromElement", e == null ? null : e.getJCOInstance());
            return new DataRow(objGetRowFromElement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlElement CreateElement(java.lang.String prefix, java.lang.String localName, java.lang.String namespaceURI) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.FormatException, system.xml.XmlException, system.data.sqltypes.SqlNullValueException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateElement = (JCObject)classInstance.Invoke("CreateElement", prefix, localName, namespaceURI);
            return new XmlElement(objCreateElement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlElement GetElementById(java.lang.String elemId) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetElementById = (JCObject)classInstance.Invoke("GetElementById", elemId);
            return new XmlElement(objGetElementById);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlElement GetElementFromRow(DataRow r) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetElementFromRow = (JCObject)classInstance.Invoke("GetElementFromRow", r == null ? null : r.getJCOInstance());
            return new XmlElement(objGetElementFromRow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlEntityReference CreateEntityReference(java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateEntityReference = (JCObject)classInstance.Invoke("CreateEntityReference", name);
            return new XmlEntityReference(objCreateEntityReference);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode CloneNode(boolean deep) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.xml.XmlException, system.IndexOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.threading.SynchronizationLockException, system.RankException, system.data.sqltypes.SqlNullValueException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCloneNode = (JCObject)classInstance.Invoke("CloneNode", deep);
            return new XmlNode(objCloneNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNodeList GetElementsByTagName(java.lang.String name) throws Throwable, system.ArgumentException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetElementsByTagName = (JCObject)classInstance.Invoke("GetElementsByTagName", name);
            return new XmlNodeList(objGetElementsByTagName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(Stream inStream) throws Throwable, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.xml.XmlException, system.InvalidOperationException, system.xml.schema.XmlSchemaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Load", inStream == null ? null : inStream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(TextReader txtReader) throws Throwable, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.xml.XmlException, system.InvalidOperationException, system.xml.schema.XmlSchemaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Load", txtReader == null ? null : txtReader.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(java.lang.String filename) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.xml.XmlException, system.xml.schema.XmlSchemaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Load", filename);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(XmlReader reader) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.data.sqltypes.SqlNullValueException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.NotSupportedException, system.xml.XmlException, system.xml.schema.XmlSchemaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Load", reader == null ? null : reader.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public DataSet getDataSet() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DataSet");
            return new DataSet(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}