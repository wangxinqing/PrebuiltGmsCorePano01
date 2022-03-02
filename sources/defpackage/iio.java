package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: iio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iio extends iii {
    private Audience a;
    private TextView b;

    public final mby getView() {
        return mbz.a((Object) this.b);
    }

    public final void initialize(mby mby, mby mby2, iim iim) {
        this.b = new TextView((Context) mbz.a(mby));
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        setAudience((Audience) bundle.getParcelable("audience"));
    }

    public final Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("audience", this.a);
        return bundle;
    }

    public final void setAudience(Audience audience) {
        this.a = audience;
        if (audience != null) {
            String str = null;
            for (AudienceMember audienceMember : audience.b) {
                String valueOf = String.valueOf(str != null ? String.valueOf(str).concat(", ") : "");
                String valueOf2 = String.valueOf(audienceMember.f);
                str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            }
            this.b.setText(str);
            return;
        }
        this.b.setText("");
    }

    public final void setEditMode(int i) {
    }

    public final void setIsUnderageAccount(boolean z) {
    }

    public final void setShowEmptyText(boolean z) {
    }
}
