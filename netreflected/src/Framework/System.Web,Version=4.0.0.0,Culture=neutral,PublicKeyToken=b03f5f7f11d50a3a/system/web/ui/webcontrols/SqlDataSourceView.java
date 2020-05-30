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

package system.web.ui.webcontrols;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.ui.webcontrols.SqlDataSource;
import system.web.HttpContext;
import system.web.ui.DataSourceSelectArguments;
import system.web.ui.ConflictOptions;
import system.web.ui.webcontrols.SqlDataSourceCommandType;
import system.web.ui.webcontrols.ParameterCollection;
import system.web.ui.webcontrols.SqlDataSourceStatusEventHandler;
import system.web.ui.webcontrols.SqlDataSourceCommandEventHandler;
import system.web.ui.webcontrols.SqlDataSourceFilteringEventHandler;
import system.web.ui.webcontrols.SqlDataSourceSelectingEventHandler;
import system.EventHandler;


/**
 * The base .NET class managing System.Web.UI.WebControls.SqlDataSourceView, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SqlDataSourceView extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.UI.WebControls.SqlDataSourceView";
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

    public SqlDataSourceView(Object instance) throws Throwable {
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

    public static SqlDataSourceView castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SqlDataSourceView(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SqlDataSourceView(SqlDataSource owner, java.lang.String name, HttpContext context) throws Throwable, system.ArgumentNullException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)owner.getJCOInstance(), (Object)name, (Object)context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean CanExecute(java.lang.String commandName) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("CanExecute", (Object)commandName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getCancelSelectOnNullParameter() throws Throwable {
        try {
            return (boolean)classInstance.Get("CancelSelectOnNullParameter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCancelSelectOnNullParameter(boolean CancelSelectOnNullParameter) throws Throwable {
        try {
            classInstance.Set("CancelSelectOnNullParameter", CancelSelectOnNullParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanDelete() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanDelete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanInsert() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanInsert");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanPage() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanPage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanRetrieveTotalRowCount() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanRetrieveTotalRowCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanSort() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanSort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanUpdate() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanUpdate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConflictOptions getConflictDetection() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ConflictDetection");
            return new ConflictOptions(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConflictDetection(ConflictOptions ConflictDetection) throws Throwable {
        try {
            classInstance.Set("ConflictDetection", (Object)ConflictDetection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDeleteCommand() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DeleteCommand");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDeleteCommand(java.lang.String DeleteCommand) throws Throwable {
        try {
            classInstance.Set("DeleteCommand", (Object)DeleteCommand);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDataSourceCommandType getDeleteCommandType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DeleteCommandType");
            return new SqlDataSourceCommandType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDeleteCommandType(SqlDataSourceCommandType DeleteCommandType) throws Throwable {
        try {
            classInstance.Set("DeleteCommandType", (Object)DeleteCommandType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ParameterCollection getDeleteParameters() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DeleteParameters");
            return new ParameterCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFilterExpression() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("FilterExpression");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFilterExpression(java.lang.String FilterExpression) throws Throwable {
        try {
            classInstance.Set("FilterExpression", (Object)FilterExpression);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ParameterCollection getFilterParameters() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FilterParameters");
            return new ParameterCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getInsertCommand() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("InsertCommand");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInsertCommand(java.lang.String InsertCommand) throws Throwable {
        try {
            classInstance.Set("InsertCommand", (Object)InsertCommand);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDataSourceCommandType getInsertCommandType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InsertCommandType");
            return new SqlDataSourceCommandType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInsertCommandType(SqlDataSourceCommandType InsertCommandType) throws Throwable {
        try {
            classInstance.Set("InsertCommandType", (Object)InsertCommandType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ParameterCollection getInsertParameters() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InsertParameters");
            return new ParameterCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getOldValuesParameterFormatString() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("OldValuesParameterFormatString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOldValuesParameterFormatString(java.lang.String OldValuesParameterFormatString) throws Throwable {
        try {
            classInstance.Set("OldValuesParameterFormatString", (Object)OldValuesParameterFormatString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSelectCommand() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SelectCommand");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSelectCommand(java.lang.String SelectCommand) throws Throwable {
        try {
            classInstance.Set("SelectCommand", (Object)SelectCommand);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDataSourceCommandType getSelectCommandType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SelectCommandType");
            return new SqlDataSourceCommandType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSelectCommandType(SqlDataSourceCommandType SelectCommandType) throws Throwable {
        try {
            classInstance.Set("SelectCommandType", (Object)SelectCommandType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ParameterCollection getSelectParameters() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SelectParameters");
            return new ParameterCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSortParameterName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SortParameterName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSortParameterName(java.lang.String SortParameterName) throws Throwable {
        try {
            classInstance.Set("SortParameterName", (Object)SortParameterName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUpdateCommand() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("UpdateCommand");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUpdateCommand(java.lang.String UpdateCommand) throws Throwable {
        try {
            classInstance.Set("UpdateCommand", (Object)UpdateCommand);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDataSourceCommandType getUpdateCommandType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("UpdateCommandType");
            return new SqlDataSourceCommandType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUpdateCommandType(SqlDataSourceCommandType UpdateCommandType) throws Throwable {
        try {
            classInstance.Set("UpdateCommandType", (Object)UpdateCommandType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ParameterCollection getUpdateParameters() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("UpdateParameters");
            return new ParameterCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addDeleted(SqlDataSourceStatusEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Deleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDeleted(SqlDataSourceStatusEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Deleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDeleting(SqlDataSourceCommandEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Deleting", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDeleting(SqlDataSourceCommandEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Deleting", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addFiltering(SqlDataSourceFilteringEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Filtering", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeFiltering(SqlDataSourceFilteringEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Filtering", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addInserted(SqlDataSourceStatusEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Inserted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeInserted(SqlDataSourceStatusEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Inserted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addInserting(SqlDataSourceCommandEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Inserting", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeInserting(SqlDataSourceCommandEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Inserting", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addSelected(SqlDataSourceStatusEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Selected", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeSelected(SqlDataSourceStatusEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Selected", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addSelecting(SqlDataSourceSelectingEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Selecting", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeSelecting(SqlDataSourceSelectingEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Selecting", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addUpdated(SqlDataSourceStatusEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Updated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeUpdated(SqlDataSourceStatusEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Updated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addUpdating(SqlDataSourceCommandEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Updating", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeUpdating(SqlDataSourceCommandEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Updating", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDataSourceViewChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("DataSourceViewChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDataSourceViewChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("DataSourceViewChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}