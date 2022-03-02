package defpackage;

import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.Collection;
import java.util.LinkedHashSet;

/* renamed from: ixb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ixb {
    public static Audience a(Audience audience, AudienceMember audienceMember) {
        iva.a((Object) audience, (Object) "Audience must not be null.");
        iva.a((Object) audienceMember, (Object) "Audience member must not be null.");
        LinkedHashSet linkedHashSet = new LinkedHashSet(audience.b);
        linkedHashSet.add(audienceMember);
        iww iww = new iww(audience);
        iww.a((Collection) linkedHashSet);
        return iww.a();
    }

    public static Audience b(Audience audience, AudienceMember audienceMember) {
        iva.a((Object) audience, (Object) "Audience must not be null.");
        iva.a((Object) audienceMember, (Object) "Audience member must not be null.");
        LinkedHashSet linkedHashSet = new LinkedHashSet(audience.b);
        linkedHashSet.remove(audienceMember);
        iww iww = new iww(audience);
        iww.a((Collection) linkedHashSet);
        return iww.a();
    }

    public static boolean a(Audience audience) {
        iva.a((Object) audience, (Object) "Audience must not be null.");
        return !audience.e && audience.b.isEmpty();
    }
}
