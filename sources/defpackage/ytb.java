package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: ytb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ytb extends IInterface {
    void configure(String str, String str2, AudienceMember audienceMember, String str3, ytd ytd);

    mby getView();

    void initialize(mby mby, mby mby2, mby mby3);

    void refreshButton();

    void setAnalyticsStartView(String str, int i);

    void setShowProgressIndicator(boolean z);

    void setSize(int i);

    void setType(int i);
}
