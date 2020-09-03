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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.DataGridViewBand;
import system.windows.forms.DataGridViewAutoSizeRowMode;
import system.windows.forms.ContextMenuStrip;
import system.windows.forms.DataGridViewAdvancedBorderStyle;
import system.windows.forms.DataGridViewElementStates;
import system.windows.forms.DataGridView;
import system.windows.forms.AccessibleObject;
import system.windows.forms.DataGridViewCellCollection;
import system.windows.forms.DataGridViewCellStyle;
import system.windows.forms.DataGridViewRowHeaderCell;
import system.windows.forms.DataGridViewTriState;


/**
 * The base .NET class managing System.Windows.Forms.DataGridViewRow, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.DataGridViewRow" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.DataGridViewRow</a>
 */
public class DataGridViewRow extends DataGridViewBand  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.DataGridViewRow
     */
    public static final String className = "System.Windows.Forms.DataGridViewRow";
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

    public DataGridViewRow(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DataGridViewRow}, a cast assert is made to check if types are compatible.
	 * @param {@link IJCOBridgeReflected} instance to be casted
	 * @return {@link DataGridViewRow} instance
	 * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DataGridViewRow cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DataGridViewRow(from.getJCOInstance());
    }

    // Constructors section
    
    public DataGridViewRow() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.ArithmeticException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.RankException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean SetValues(NetObject... values) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetValues", (Object)toObjectFromArray(values));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetPreferredHeight(int rowIndex, DataGridViewAutoSizeRowMode autoSizeRowMode, boolean fixedWidth) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetPreferredHeight", rowIndex, autoSizeRowMode == null ? null : autoSizeRowMode.getJCOInstance(), fixedWidth);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Clone() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArithmeticException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetErrorText(int rowIndex) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetErrorText", rowIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContextMenuStrip GetContextMenuStrip(int rowIndex) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetContextMenuStrip = (JCObject)classInstance.Invoke("GetContextMenuStrip", rowIndex);
            return new ContextMenuStrip(objGetContextMenuStrip);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewAdvancedBorderStyle AdjustRowHeaderBorderStyle(DataGridViewAdvancedBorderStyle dataGridViewAdvancedBorderStyleInput, DataGridViewAdvancedBorderStyle dataGridViewAdvancedBorderStylePlaceholder, boolean singleVerticalBorderAdded, boolean singleHorizontalBorderAdded, boolean isFirstDisplayedRow, boolean isLastVisibleRow) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArithmeticException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdjustRowHeaderBorderStyle = (JCObject)classInstance.Invoke("AdjustRowHeaderBorderStyle", dataGridViewAdvancedBorderStyleInput == null ? null : dataGridViewAdvancedBorderStyleInput.getJCOInstance(), dataGridViewAdvancedBorderStylePlaceholder == null ? null : dataGridViewAdvancedBorderStylePlaceholder.getJCOInstance(), singleVerticalBorderAdded, singleHorizontalBorderAdded, isFirstDisplayedRow, isLastVisibleRow);
            return new DataGridViewAdvancedBorderStyle(objAdjustRowHeaderBorderStyle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewElementStates GetState(int rowIndex) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetState = (JCObject)classInstance.Invoke("GetState", rowIndex);
            return new DataGridViewElementStates(objGetState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CreateCells(DataGridView dataGridView) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.componentmodel.Win32Exception, system.threading.ThreadStateException, system.collections.generic.KeyNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CreateCells", dataGridView == null ? null : dataGridView.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CreateCells(DataGridView dataGridView, NetObject... values) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.threading.ThreadStateException, system.collections.generic.KeyNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CreateCells", dataGridView == null ? null : dataGridView.getJCOInstance(), toObjectFromArray(values));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsNewRow() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsNewRow");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDividerHeight() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("DividerHeight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDividerHeight(int DividerHeight) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DividerHeight", DividerHeight);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getHeight() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Height");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeight(int Height) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.ArithmeticException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Height", Height);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMinimumHeight() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MinimumHeight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMinimumHeight(int MinimumHeight) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.ArithmeticException, system.IndexOutOfRangeException, system.RankException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MinimumHeight", MinimumHeight);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getDataBoundItem() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DataBoundItem");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getErrorText() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ErrorText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setErrorText(java.lang.String ErrorText) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ErrorText", ErrorText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AccessibleObject getAccessibilityObject() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AccessibilityObject");
            return new AccessibleObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewCellCollection getCells() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Cells");
            return new DataGridViewCellCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewRowHeaderCell getHeaderCell() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("HeaderCell");
            return new DataGridViewRowHeaderCell(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeaderCell(DataGridViewRowHeaderCell HeaderCell) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HeaderCell", HeaderCell == null ? null : HeaderCell.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}