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

package system.reflection.metadata.ecma335;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.metadata.HandleKind;
import system.reflection.metadata.BlobHandle;
import system.reflection.metadata.GuidHandle;
import system.reflection.metadata.Handle;
import system.reflection.metadata.MetadataReader;
import system.reflection.metadata.StringHandle;
import system.reflection.metadata.UserStringHandle;
import system.reflection.metadata.EntityHandle;
import system.reflection.metadata.AssemblyFileHandle;
import system.reflection.metadata.AssemblyReferenceHandle;
import system.reflection.metadata.ConstantHandle;
import system.reflection.metadata.CustomAttributeHandle;
import system.reflection.metadata.CustomDebugInformationHandle;
import system.reflection.metadata.DeclarativeSecurityAttributeHandle;
import system.reflection.metadata.DocumentHandle;
import system.reflection.metadata.DocumentNameBlobHandle;
import system.reflection.metadata.ecma335.TableIndex;
import system.reflection.metadata.EventDefinitionHandle;
import system.reflection.metadata.ExportedTypeHandle;
import system.reflection.metadata.FieldDefinitionHandle;
import system.reflection.metadata.GenericParameterConstraintHandle;
import system.reflection.metadata.GenericParameterHandle;
import system.reflection.metadata.ImportScopeHandle;
import system.reflection.metadata.InterfaceImplementationHandle;
import system.reflection.metadata.LocalConstantHandle;
import system.reflection.metadata.LocalScopeHandle;
import system.reflection.metadata.LocalVariableHandle;
import system.reflection.metadata.ManifestResourceHandle;
import system.reflection.metadata.MemberReferenceHandle;
import system.reflection.metadata.MethodDebugInformationHandle;
import system.reflection.metadata.MethodDefinitionHandle;
import system.reflection.metadata.MethodImplementationHandle;
import system.reflection.metadata.MethodSpecificationHandle;
import system.reflection.metadata.ModuleReferenceHandle;
import system.reflection.metadata.ParameterHandle;
import system.reflection.metadata.PropertyDefinitionHandle;
import system.reflection.metadata.StandaloneSignatureHandle;
import system.reflection.metadata.TypeDefinitionHandle;
import system.reflection.metadata.TypeReferenceHandle;
import system.reflection.metadata.TypeSpecificationHandle;


/**
 * The base .NET class managing System.Reflection.Metadata.Ecma335.MetadataTokens, System.Reflection.Metadata, Version=1.4.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Metadata.Ecma335.MetadataTokens" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Metadata.Ecma335.MetadataTokens</a>
 */
public class MetadataTokens extends NetObject  {
    /**
     * Fully assembly qualified name: System.Reflection.Metadata, Version=1.4.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Reflection.Metadata, Version=1.4.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Reflection.Metadata
     */
    public static final String assemblyShortName = "System.Reflection.Metadata";
    /**
     * Qualified class name: System.Reflection.Metadata.Ecma335.MetadataTokens
     */
    public static final String className = "System.Reflection.Metadata.Ecma335.MetadataTokens";
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

    public MetadataTokens(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MetadataTokens}, a cast assert is made to check if types are compatible.
	 * @param {@link IJCOBridgeReflected} instance to be casted
	 * @return {@link MetadataTokens} instance
	 * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MetadataTokens cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MetadataTokens(from.getJCOInstance());
    }

    // Constructors section
    
    public MetadataTokens() throws Throwable {
    }

    
    // Methods section
    
    public static int GetHeapOffset(BlobHandle handle) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetHeapOffset", handle == null ? null : handle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetHeapOffset(GuidHandle handle) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetHeapOffset", handle == null ? null : handle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetHeapOffset(Handle handle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetHeapOffset", handle == null ? null : handle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetHeapOffset(MetadataReader reader, Handle handle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetHeapOffset", reader == null ? null : reader.getJCOInstance(), handle == null ? null : handle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetHeapOffset(StringHandle handle) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetHeapOffset", handle == null ? null : handle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetHeapOffset(UserStringHandle handle) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetHeapOffset", handle == null ? null : handle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetRowNumber(EntityHandle handle) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetRowNumber", handle == null ? null : handle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetRowNumber(MetadataReader reader, EntityHandle handle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetRowNumber", reader == null ? null : reader.getJCOInstance(), handle == null ? null : handle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetToken(EntityHandle handle) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetToken", handle == null ? null : handle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetToken(Handle handle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetToken", handle == null ? null : handle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetToken(MetadataReader reader, EntityHandle handle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetToken", reader == null ? null : reader.getJCOInstance(), handle == null ? null : handle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetToken(MetadataReader reader, Handle handle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetToken", reader == null ? null : reader.getJCOInstance(), handle == null ? null : handle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static AssemblyFileHandle AssemblyFileHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAssemblyFileHandle = (JCObject)classType.Invoke("AssemblyFileHandle", rowNumber);
            return new AssemblyFileHandle(objAssemblyFileHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static AssemblyReferenceHandle AssemblyReferenceHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAssemblyReferenceHandle = (JCObject)classType.Invoke("AssemblyReferenceHandle", rowNumber);
            return new AssemblyReferenceHandle(objAssemblyReferenceHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BlobHandle BlobHandle(int offset) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objBlobHandle = (JCObject)classType.Invoke("BlobHandle", offset);
            return new BlobHandle(objBlobHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ConstantHandle ConstantHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objConstantHandle = (JCObject)classType.Invoke("ConstantHandle", rowNumber);
            return new ConstantHandle(objConstantHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static CustomAttributeHandle CustomAttributeHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCustomAttributeHandle = (JCObject)classType.Invoke("CustomAttributeHandle", rowNumber);
            return new CustomAttributeHandle(objCustomAttributeHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static CustomDebugInformationHandle CustomDebugInformationHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCustomDebugInformationHandle = (JCObject)classType.Invoke("CustomDebugInformationHandle", rowNumber);
            return new CustomDebugInformationHandle(objCustomDebugInformationHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DeclarativeSecurityAttributeHandle DeclarativeSecurityAttributeHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDeclarativeSecurityAttributeHandle = (JCObject)classType.Invoke("DeclarativeSecurityAttributeHandle", rowNumber);
            return new DeclarativeSecurityAttributeHandle(objDeclarativeSecurityAttributeHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DocumentHandle DocumentHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDocumentHandle = (JCObject)classType.Invoke("DocumentHandle", rowNumber);
            return new DocumentHandle(objDocumentHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DocumentNameBlobHandle DocumentNameBlobHandle(int offset) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDocumentNameBlobHandle = (JCObject)classType.Invoke("DocumentNameBlobHandle", offset);
            return new DocumentNameBlobHandle(objDocumentNameBlobHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EntityHandle EntityHandle(int token) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objEntityHandle = (JCObject)classType.Invoke("EntityHandle", token);
            return new EntityHandle(objEntityHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EntityHandle EntityHandle(TableIndex tableIndex, int rowNumber) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objEntityHandle = (JCObject)classType.Invoke("EntityHandle", tableIndex == null ? null : tableIndex.getJCOInstance(), rowNumber);
            return new EntityHandle(objEntityHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EntityHandle Handle(TableIndex tableIndex, int rowNumber) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHandle = (JCObject)classType.Invoke("Handle", tableIndex == null ? null : tableIndex.getJCOInstance(), rowNumber);
            return new EntityHandle(objHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinitionHandle EventDefinitionHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objEventDefinitionHandle = (JCObject)classType.Invoke("EventDefinitionHandle", rowNumber);
            return new EventDefinitionHandle(objEventDefinitionHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ExportedTypeHandle ExportedTypeHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objExportedTypeHandle = (JCObject)classType.Invoke("ExportedTypeHandle", rowNumber);
            return new ExportedTypeHandle(objExportedTypeHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FieldDefinitionHandle FieldDefinitionHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFieldDefinitionHandle = (JCObject)classType.Invoke("FieldDefinitionHandle", rowNumber);
            return new FieldDefinitionHandle(objFieldDefinitionHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static GenericParameterConstraintHandle GenericParameterConstraintHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenericParameterConstraintHandle = (JCObject)classType.Invoke("GenericParameterConstraintHandle", rowNumber);
            return new GenericParameterConstraintHandle(objGenericParameterConstraintHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static GenericParameterHandle GenericParameterHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenericParameterHandle = (JCObject)classType.Invoke("GenericParameterHandle", rowNumber);
            return new GenericParameterHandle(objGenericParameterHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static GuidHandle GuidHandle(int offset) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGuidHandle = (JCObject)classType.Invoke("GuidHandle", offset);
            return new GuidHandle(objGuidHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Handle Handle(int token) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHandle = (JCObject)classType.Invoke("Handle", token);
            return new Handle(objHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ImportScopeHandle ImportScopeHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objImportScopeHandle = (JCObject)classType.Invoke("ImportScopeHandle", rowNumber);
            return new ImportScopeHandle(objImportScopeHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static InterfaceImplementationHandle InterfaceImplementationHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objInterfaceImplementationHandle = (JCObject)classType.Invoke("InterfaceImplementationHandle", rowNumber);
            return new InterfaceImplementationHandle(objInterfaceImplementationHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static LocalConstantHandle LocalConstantHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLocalConstantHandle = (JCObject)classType.Invoke("LocalConstantHandle", rowNumber);
            return new LocalConstantHandle(objLocalConstantHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static LocalScopeHandle LocalScopeHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLocalScopeHandle = (JCObject)classType.Invoke("LocalScopeHandle", rowNumber);
            return new LocalScopeHandle(objLocalScopeHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static LocalVariableHandle LocalVariableHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLocalVariableHandle = (JCObject)classType.Invoke("LocalVariableHandle", rowNumber);
            return new LocalVariableHandle(objLocalVariableHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ManifestResourceHandle ManifestResourceHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objManifestResourceHandle = (JCObject)classType.Invoke("ManifestResourceHandle", rowNumber);
            return new ManifestResourceHandle(objManifestResourceHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemberReferenceHandle MemberReferenceHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMemberReferenceHandle = (JCObject)classType.Invoke("MemberReferenceHandle", rowNumber);
            return new MemberReferenceHandle(objMemberReferenceHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MethodDebugInformationHandle MethodDebugInformationHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMethodDebugInformationHandle = (JCObject)classType.Invoke("MethodDebugInformationHandle", rowNumber);
            return new MethodDebugInformationHandle(objMethodDebugInformationHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MethodDefinitionHandle MethodDefinitionHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMethodDefinitionHandle = (JCObject)classType.Invoke("MethodDefinitionHandle", rowNumber);
            return new MethodDefinitionHandle(objMethodDefinitionHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MethodImplementationHandle MethodImplementationHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMethodImplementationHandle = (JCObject)classType.Invoke("MethodImplementationHandle", rowNumber);
            return new MethodImplementationHandle(objMethodImplementationHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MethodSpecificationHandle MethodSpecificationHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMethodSpecificationHandle = (JCObject)classType.Invoke("MethodSpecificationHandle", rowNumber);
            return new MethodSpecificationHandle(objMethodSpecificationHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModuleReferenceHandle ModuleReferenceHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objModuleReferenceHandle = (JCObject)classType.Invoke("ModuleReferenceHandle", rowNumber);
            return new ModuleReferenceHandle(objModuleReferenceHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ParameterHandle ParameterHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParameterHandle = (JCObject)classType.Invoke("ParameterHandle", rowNumber);
            return new ParameterHandle(objParameterHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PropertyDefinitionHandle PropertyDefinitionHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objPropertyDefinitionHandle = (JCObject)classType.Invoke("PropertyDefinitionHandle", rowNumber);
            return new PropertyDefinitionHandle(objPropertyDefinitionHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static StandaloneSignatureHandle StandaloneSignatureHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objStandaloneSignatureHandle = (JCObject)classType.Invoke("StandaloneSignatureHandle", rowNumber);
            return new StandaloneSignatureHandle(objStandaloneSignatureHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static StringHandle StringHandle(int offset) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objStringHandle = (JCObject)classType.Invoke("StringHandle", offset);
            return new StringHandle(objStringHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TypeDefinitionHandle TypeDefinitionHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTypeDefinitionHandle = (JCObject)classType.Invoke("TypeDefinitionHandle", rowNumber);
            return new TypeDefinitionHandle(objTypeDefinitionHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TypeReferenceHandle TypeReferenceHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTypeReferenceHandle = (JCObject)classType.Invoke("TypeReferenceHandle", rowNumber);
            return new TypeReferenceHandle(objTypeReferenceHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TypeSpecificationHandle TypeSpecificationHandle(int rowNumber) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTypeSpecificationHandle = (JCObject)classType.Invoke("TypeSpecificationHandle", rowNumber);
            return new TypeSpecificationHandle(objTypeSpecificationHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UserStringHandle UserStringHandle(int offset) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUserStringHandle = (JCObject)classType.Invoke("UserStringHandle", offset);
            return new UserStringHandle(objUserStringHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}