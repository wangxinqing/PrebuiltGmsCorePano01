package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.Comparator;

/* renamed from: zkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zkv implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AudienceMember audienceMember = (AudienceMember) obj;
        AudienceMember audienceMember2 = (AudienceMember) obj2;
        String str = audienceMember.f;
        String str2 = audienceMember2.f;
        if (TextUtils.isEmpty(str)) {
            return !TextUtils.isEmpty(str2) ? -1 : 0;
        }
        if (TextUtils.isEmpty(str2)) {
            return 1;
        }
        return audienceMember.f.compareTo(audienceMember2.f);
    }
}
