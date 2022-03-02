package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.people.data.Audience;

/* renamed from: iij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface iij extends IInterface {
    mby getView();

    void initialize(mby mby, mby mby2, iim iim);

    void onRestoreInstanceState(Bundle bundle);

    Bundle onSaveInstanceState();

    void setAudience(Audience audience);

    void setEditMode(int i);

    void setIsUnderageAccount(boolean z);

    void setShowEmptyText(boolean z);
}
