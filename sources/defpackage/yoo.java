package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.List;

/* renamed from: yoo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yoo extends zni {
    final /* synthetic */ yoy a;
    private final List b;
    private final int c;
    private final int d;
    private final int e;

    public yoo(yoy yoy, List list, int i, int i2, int i3) {
        this.a = yoy;
        this.b = list;
        this.c = i;
        this.d = i2 - i;
        this.e = i3;
    }

    public final int a(int i) {
        return this.a.k;
    }

    /* renamed from: c */
    public final AudienceMember b(int i) {
        return (AudienceMember) this.b.get(this.c + i);
    }

    public final int d() {
        return this.d;
    }

    public final View a(int i, View view, ViewGroup viewGroup, boolean z) {
        AudienceMember c2 = b(i);
        c2.h.putInt("selectionSource", this.e);
        yoy yoy = this.a;
        String str = c2.f;
        String string = c2.h.getString("secondaryText");
        String str2 = c2.e;
        String str3 = c2.g;
        String string2 = c2.h.getString("contactsAvatarUri");
        yoy yoy2 = this.a;
        int i2 = yoy.E;
        Audience audience = yoy2.l.a;
        iva.a((Object) audience, (Object) "Audience must not be null.");
        iva.a((Object) c2, (Object) "Audience member must not be null.");
        return yoy.a(c2, str, string, str2, str3, string2, audience.b.contains(c2), R.layout.plus_audience_selection_list_person, view, z, false, c2.h.getBoolean("checkboxEnabled", true));
    }
}
