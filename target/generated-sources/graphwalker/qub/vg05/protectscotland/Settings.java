// Generated by GraphWalker (http://www.graphwalker.org)
package qub.vg05.protectscotland;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "qub/vg05/protectscotland/ProtectScotlandModel.json")
public interface Settings {

    @Vertex()
    void v_Verify_Settings_Page();

    @Edge()
    void e_No_Action_Home();

    @Edge()
    void e_Click_Data_Privacy_Notice();

    @Edge()
    void e_No_Action_Home_Back();

    @Edge()
    void e_Click_Leave();

    @Vertex()
    void v_Verify_Data_Privacy_Page();

    @Edge()
    void e_Click_Back_Arrow();

    @Edge()
    void e_Click_Confirm();

    @Vertex()
    void v_Verify_In_Settings_Home_Tour_Page_SHARED();

    @Edge()
    void e_Click_Terms_Conditions();

    @Vertex()
    void v_Verify_In_Terms_And_Conditions_Page();

    @Vertex()
    void v_Verify_In_Settings_Home_Page_SHARED();

    @Edge()
    void e_No_Action_Tour_Back();

    @Vertex()
    void v_Leave_Conformation_Message();

    @Edge()
    void e_No_Action_Tour();

    @Vertex()
    void v_Verify_In_Age_Page_SHARED();

    @Edge()
    void e_Click_Cancel();

    @Edge()
    void e_Click_I_Want_To_Leave();

    @Vertex()
    void v_Verify_In_Leave_Page();
}