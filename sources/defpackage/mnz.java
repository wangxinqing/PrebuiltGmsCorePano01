package defpackage;

import com.google.android.gms.family.model.DashboardDataModel;
import com.google.android.gms.family.model.InvitationDataModel;
import com.google.android.gms.family.model.MemberDataModel;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.v2.model.PageDataMap;
import java.util.ArrayList;

/* renamed from: mnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface mnz {
    void a(DashboardDataModel dashboardDataModel);

    void a(InvitationDataModel invitationDataModel);

    void a(MemberDataModel memberDataModel);

    void a(MemberDataModel memberDataModel, String str, boolean z);

    void a(MemberDataModel memberDataModel, String str, boolean z, boolean z2);

    void a(ContactPickerOptionsData contactPickerOptionsData);

    void a(PageData pageData);

    void a(PageData pageData, String str, int i);

    void a(PageDataMap pageDataMap);

    void a(ArrayList arrayList, PageData pageData);

    mhi b();

    void b(int i, int i2);

    void b(MemberDataModel memberDataModel);

    void b(PageData pageData);

    void e();

    void f();

    void g();

    void h();

    void i();

    mfr j();

    mfp k();

    void o();
}
