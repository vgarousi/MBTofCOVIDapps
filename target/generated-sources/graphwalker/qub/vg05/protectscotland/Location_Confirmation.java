// Generated by GraphWalker (http://www.graphwalker.org)
package qub.vg05.protectscotland;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "qub/vg05/protectscotland/ProtectScotlandModel.json")
public interface Location_Confirmation {

    @Vertex()
    void v_Verify_In_Location_Page_SHARED();

    @Edge()
    void e_Click_No();

    @Vertex()
    void v_Verify_In_Helping_Others_Page_SHARED();

    @Edge()
    void e_Click_Yes();

    @Vertex()
    void v_Invalid_Location_Warning_Message();

    @Edge()
    void e_Click_Back_Arrow();

    @Edge()
    void e_Click_Ok();
}