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

package system.xml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.DateTime;
import system.DateTimeOffset;
import system.Single;
import system.Decimal;
import system.xml.XmlReader;
import system.xml.xpath.XPathNavigator;
import system.xml.XmlWriter;
import system.xml.XmlWriterSettings;
import system.io.Stream;
import system.io.TextWriter;
import system.text.StringBuilder;
import system.threading.tasks.Task;
import system.xml.WriteState;
import system.xml.XmlSpace;


/**
 * The base .NET class managing System.Xml.XmlWriter, System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class XmlWriter extends NetObject  {
    public static final String assemblyFullName = "System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Xml";
    public static final String className = "System.Xml.XmlWriter";
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

    public XmlWriter(Object instance) throws Throwable {
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

    public static XmlWriter castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XmlWriter(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void WriteStartElement(java.lang.String localName, java.lang.String ns) throws Throwable {
        try {
            classInstance.Invoke("WriteStartElement", (Object)localName, (Object)ns);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteStartElement(java.lang.String localName) throws Throwable {
        try {
            classInstance.Invoke("WriteStartElement", (Object)localName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteAttributeString(java.lang.String localName, java.lang.String ns, java.lang.String value) throws Throwable {
        try {
            classInstance.Invoke("WriteAttributeString", (Object)localName, (Object)ns, (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteAttributeString(java.lang.String localName, java.lang.String value) throws Throwable {
        try {
            classInstance.Invoke("WriteAttributeString", (Object)localName, (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteAttributeString(java.lang.String prefix, java.lang.String localName, java.lang.String ns, java.lang.String value) throws Throwable {
        try {
            classInstance.Invoke("WriteAttributeString", (Object)prefix, (Object)localName, (Object)ns, (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteStartAttribute(java.lang.String localName, java.lang.String ns) throws Throwable {
        try {
            classInstance.Invoke("WriteStartAttribute", (Object)localName, (Object)ns);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteStartAttribute(java.lang.String localName) throws Throwable {
        try {
            classInstance.Invoke("WriteStartAttribute", (Object)localName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteBinHex(byte[] buffer, int index, int count) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("WriteBinHex", buffer, index, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable {
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteNmToken(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        try {
            classInstance.Invoke("WriteNmToken", (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteName(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            classInstance.Invoke("WriteName", (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteValue(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            classInstance.Invoke("WriteValue", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteValue(java.lang.String value) throws Throwable {
        try {
            classInstance.Invoke("WriteValue", (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteValue(DateTime value) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.OverflowException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException {
        try {
            classInstance.Invoke("WriteValue", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteValue(DateTimeOffset value) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.OverflowException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            classInstance.Invoke("WriteValue", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteValue(double value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("WriteValue", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteValue(Single value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("WriteValue", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteValue(Decimal value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("WriteValue", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteValue(int value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("WriteValue", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteValue(long value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("WriteValue", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteAttributes(XmlReader reader, boolean defattr) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.XmlException {
        try {
            classInstance.Invoke("WriteAttributes", (Object)reader.getJCOInstance(), defattr);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteNode(XPathNavigator navigator, boolean defattr) throws Throwable, system.ArgumentNullException {
        try {
            classInstance.Invoke("WriteNode", (Object)navigator.getJCOInstance(), defattr);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteElementString(java.lang.String localName, java.lang.String value) throws Throwable {
        try {
            classInstance.Invoke("WriteElementString", (Object)localName, (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteElementString(java.lang.String localName, java.lang.String ns, java.lang.String value) throws Throwable {
        try {
            classInstance.Invoke("WriteElementString", (Object)localName, (Object)ns, (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteElementString(java.lang.String prefix, java.lang.String localName, java.lang.String ns, java.lang.String value) throws Throwable {
        try {
            classInstance.Invoke("WriteElementString", (Object)prefix, (Object)localName, (Object)ns, (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlWriter Create(java.lang.String outputFileName) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.ArgumentException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.InvalidOperationException, system.NullReferenceException, system.security.SecurityException, system.ObjectDisposedException, system.NotImplementedException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)outputFileName);
            return new XmlWriter(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlWriter Create(java.lang.String outputFileName, XmlWriterSettings settings) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.xml.XmlException, system.ArgumentException, system.io.PathTooLongException, system.NotSupportedException, system.NullReferenceException, system.security.SecurityException, system.io.IOException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotImplementedException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)outputFileName, (Object)settings.getJCOInstance());
            return new XmlWriter(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlWriter Create(Stream output) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)output.getJCOInstance());
            return new XmlWriter(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlWriter Create(Stream output, XmlWriterSettings settings) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)output.getJCOInstance(), (Object)settings.getJCOInstance());
            return new XmlWriter(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlWriter Create(TextWriter output) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.InvalidOperationException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)output.getJCOInstance());
            return new XmlWriter(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlWriter Create(TextWriter output, XmlWriterSettings settings) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.InvalidOperationException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)output.getJCOInstance(), (Object)settings.getJCOInstance());
            return new XmlWriter(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlWriter Create(StringBuilder output) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.InvalidOperationException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)output.getJCOInstance());
            return new XmlWriter(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlWriter Create(StringBuilder output, XmlWriterSettings settings) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.InvalidOperationException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)output.getJCOInstance(), (Object)settings.getJCOInstance());
            return new XmlWriter(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlWriter Create(XmlWriter output) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)output.getJCOInstance());
            return new XmlWriter(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlWriter Create(XmlWriter output, XmlWriterSettings settings) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)output.getJCOInstance(), (Object)settings.getJCOInstance());
            return new XmlWriter(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteStartDocumentAsync() throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteStartDocumentAsync = (JCObject)classInstance.Invoke("WriteStartDocumentAsync");
            return new Task(objWriteStartDocumentAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteStartDocumentAsync(boolean standalone) throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteStartDocumentAsync = (JCObject)classInstance.Invoke("WriteStartDocumentAsync", standalone);
            return new Task(objWriteStartDocumentAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteEndDocumentAsync() throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteEndDocumentAsync = (JCObject)classInstance.Invoke("WriteEndDocumentAsync");
            return new Task(objWriteEndDocumentAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteDocTypeAsync(java.lang.String name, java.lang.String pubid, java.lang.String sysid, java.lang.String subset) throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteDocTypeAsync = (JCObject)classInstance.Invoke("WriteDocTypeAsync", (Object)name, (Object)pubid, (Object)sysid, (Object)subset);
            return new Task(objWriteDocTypeAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteStartElementAsync(java.lang.String prefix, java.lang.String localName, java.lang.String ns) throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteStartElementAsync = (JCObject)classInstance.Invoke("WriteStartElementAsync", (Object)prefix, (Object)localName, (Object)ns);
            return new Task(objWriteStartElementAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteEndElementAsync() throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteEndElementAsync = (JCObject)classInstance.Invoke("WriteEndElementAsync");
            return new Task(objWriteEndElementAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteFullEndElementAsync() throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteFullEndElementAsync = (JCObject)classInstance.Invoke("WriteFullEndElementAsync");
            return new Task(objWriteFullEndElementAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteCDataAsync(java.lang.String text) throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteCDataAsync = (JCObject)classInstance.Invoke("WriteCDataAsync", (Object)text);
            return new Task(objWriteCDataAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteCommentAsync(java.lang.String text) throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteCommentAsync = (JCObject)classInstance.Invoke("WriteCommentAsync", (Object)text);
            return new Task(objWriteCommentAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteProcessingInstructionAsync(java.lang.String name, java.lang.String text) throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteProcessingInstructionAsync = (JCObject)classInstance.Invoke("WriteProcessingInstructionAsync", (Object)name, (Object)text);
            return new Task(objWriteProcessingInstructionAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteEntityRefAsync(java.lang.String name) throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteEntityRefAsync = (JCObject)classInstance.Invoke("WriteEntityRefAsync", (Object)name);
            return new Task(objWriteEntityRefAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteCharEntityAsync(char ch) throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteCharEntityAsync = (JCObject)classInstance.Invoke("WriteCharEntityAsync", ch);
            return new Task(objWriteCharEntityAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteWhitespaceAsync(java.lang.String ws) throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteWhitespaceAsync = (JCObject)classInstance.Invoke("WriteWhitespaceAsync", (Object)ws);
            return new Task(objWriteWhitespaceAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteStringAsync(java.lang.String text) throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteStringAsync = (JCObject)classInstance.Invoke("WriteStringAsync", (Object)text);
            return new Task(objWriteStringAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteSurrogateCharEntityAsync(char lowChar, char highChar) throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteSurrogateCharEntityAsync = (JCObject)classInstance.Invoke("WriteSurrogateCharEntityAsync", lowChar, highChar);
            return new Task(objWriteSurrogateCharEntityAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteCharsAsync(char[] buffer, int index, int count) throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteCharsAsync = (JCObject)classInstance.Invoke("WriteCharsAsync", buffer, index, count);
            return new Task(objWriteCharsAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteRawAsync(char[] buffer, int index, int count) throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteRawAsync = (JCObject)classInstance.Invoke("WriteRawAsync", buffer, index, count);
            return new Task(objWriteRawAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteRawAsync(java.lang.String data) throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteRawAsync = (JCObject)classInstance.Invoke("WriteRawAsync", (Object)data);
            return new Task(objWriteRawAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteBase64Async(byte[] buffer, int index, int count) throws Throwable, system.NotImplementedException {
        try {
            JCObject objWriteBase64Async = (JCObject)classInstance.Invoke("WriteBase64Async", buffer, index, count);
            return new Task(objWriteBase64Async);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteBinHexAsync(byte[] buffer, int index, int count) throws Throwable, system.ArgumentNullException, system.security.SecurityException, system.InvalidOperationException, system.NullReferenceException, system.ArgumentException {
        try {
            JCObject objWriteBinHexAsync = (JCObject)classInstance.Invoke("WriteBinHexAsync", buffer, index, count);
            return new Task(objWriteBinHexAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task FlushAsync() throws Throwable, system.NotImplementedException {
        try {
            JCObject objFlushAsync = (JCObject)classInstance.Invoke("FlushAsync");
            return new Task(objFlushAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteNmTokenAsync(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        try {
            JCObject objWriteNmTokenAsync = (JCObject)classInstance.Invoke("WriteNmTokenAsync", (Object)name);
            return new Task(objWriteNmTokenAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteNameAsync(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            JCObject objWriteNameAsync = (JCObject)classInstance.Invoke("WriteNameAsync", (Object)name);
            return new Task(objWriteNameAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteQualifiedNameAsync(java.lang.String localName, java.lang.String ns) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        try {
            JCObject objWriteQualifiedNameAsync = (JCObject)classInstance.Invoke("WriteQualifiedNameAsync", (Object)localName, (Object)ns);
            return new Task(objWriteQualifiedNameAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteAttributesAsync(XmlReader reader, boolean defattr) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        try {
            JCObject objWriteAttributesAsync = (JCObject)classInstance.Invoke("WriteAttributesAsync", (Object)reader.getJCOInstance(), defattr);
            return new Task(objWriteAttributesAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteNodeAsync(XmlReader reader, boolean defattr) throws Throwable, system.ArgumentNullException, system.security.SecurityException, system.InvalidOperationException, system.NullReferenceException, system.ArgumentException {
        try {
            JCObject objWriteNodeAsync = (JCObject)classInstance.Invoke("WriteNodeAsync", (Object)reader.getJCOInstance(), defattr);
            return new Task(objWriteNodeAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteNodeAsync(XPathNavigator navigator, boolean defattr) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        try {
            JCObject objWriteNodeAsync = (JCObject)classInstance.Invoke("WriteNodeAsync", (Object)navigator.getJCOInstance(), defattr);
            return new Task(objWriteNodeAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteElementStringAsync(java.lang.String prefix, java.lang.String localName, java.lang.String ns, java.lang.String value) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        try {
            JCObject objWriteElementStringAsync = (JCObject)classInstance.Invoke("WriteElementStringAsync", (Object)prefix, (Object)localName, (Object)ns, (Object)value);
            return new Task(objWriteElementStringAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteQualifiedName(java.lang.String localName, java.lang.String ns) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        try {
            classInstance.Invoke("WriteQualifiedName", (Object)localName, (Object)ns);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteValue(boolean value) throws Throwable {
        try {
            classInstance.Invoke("WriteValue", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteNode(XmlReader reader, boolean defattr) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.XmlException, system.NotSupportedException {
        try {
            classInstance.Invoke("WriteNode", (Object)reader.getJCOInstance(), defattr);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteAttributeStringAsync(java.lang.String prefix, java.lang.String localName, java.lang.String ns, java.lang.String value) throws Throwable, system.NotImplementedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException {
        try {
            JCObject objWriteAttributeStringAsync = (JCObject)classInstance.Invoke("WriteAttributeStringAsync", (Object)prefix, (Object)localName, (Object)ns, (Object)value);
            return new Task(objWriteAttributeStringAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public XmlWriterSettings getSettings() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Settings");
            return new XmlWriterSettings(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WriteState getWriteState() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WriteState");
            return new WriteState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSpace getXmlSpace() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("XmlSpace");
            return new XmlSpace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlLang() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlLang");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}