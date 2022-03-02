package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ian  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ian {
    public static ClientActionDataEntity a(Audience audience) {
        return a(audience != null ? audience.b : null, false, false);
    }

    public static ClientActionDataEntity a(List list, boolean z, boolean z2) {
        zgc zgc;
        String str;
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add("6");
        }
        if (z) {
            arrayList.add("5");
            zfv zfv = new zfv();
            zfs zfs = new zfs();
            zfs.b(arrayList);
            zfv.a(zfs.a());
            return (ClientActionDataEntity) zfv.a();
        } else if (list == null) {
            return null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AudienceMember audienceMember = (AudienceMember) list.get(i);
                if (audienceMember != null) {
                    if (audienceMember.a()) {
                        String str2 = audienceMember.d;
                        zfy zfy = new zfy();
                        zfy.a(str2);
                        arrayList2.add(zfy.a());
                    } else if (audienceMember.c()) {
                        String str3 = audienceMember.e;
                        String e = ycm.e(str3);
                        String g = ycm.g(str3);
                        if (!TextUtils.isEmpty(e) || !TextUtils.isEmpty(g)) {
                            zgb zgb = new zgb();
                            if (!TextUtils.isEmpty(e)) {
                                zgb.b(e);
                            }
                            if (!TextUtils.isEmpty(g)) {
                                zgb.a(g);
                            }
                            zgc = zgb.a();
                        } else {
                            if (Log.isLoggable("AclDetails", 5)) {
                                String valueOf = String.valueOf(str3);
                                Log.w("AclDetails", valueOf.length() == 0 ? new String("unhandled people qualified ID: ") : "unhandled people qualified ID: ".concat(valueOf));
                            }
                            zgc = null;
                        }
                        if (zgc != null) {
                            arrayList3.add(zgc);
                        }
                    } else if (audienceMember.b()) {
                        int i2 = audienceMember.c;
                        if (i2 == 1) {
                            str = "1";
                        } else if (i2 == 2) {
                            str = "2";
                        } else if (i2 == 3) {
                            str = "4";
                        } else if (i2 != 4) {
                            if (Log.isLoggable("AclDetails", 5)) {
                                int i3 = audienceMember.c;
                                StringBuilder sb = new StringBuilder(49);
                                sb.append("unhandled PeopleConstants.CircleType: ");
                                sb.append(i3);
                                Log.w("AclDetails", sb.toString());
                            }
                            str = "0";
                        } else {
                            str = "3";
                        }
                        arrayList.add(str);
                    } else if (Log.isLoggable("AclDetails", 5)) {
                        int i4 = audienceMember.b;
                        StringBuilder sb2 = new StringBuilder(42);
                        sb2.append("unhandled AudienceMember type: ");
                        sb2.append(i4);
                        Log.w("AclDetails", sb2.toString());
                    }
                }
            }
            if (!arrayList2.isEmpty() || !arrayList3.isEmpty() || !arrayList.isEmpty()) {
                zfs zfs2 = new zfs();
                if (!arrayList2.isEmpty()) {
                    zfs2.a(arrayList2);
                }
                if (!arrayList3.isEmpty()) {
                    zfs2.a = arrayList3;
                    zfs2.b.add(4);
                }
                if (!arrayList.isEmpty()) {
                    zfs2.b(arrayList);
                }
                zfv zfv2 = new zfv();
                zfv2.a(zfs2.a());
                return (ClientActionDataEntity) zfv2.a();
            }
            if (Log.isLoggable("AclDetails", 5)) {
                String valueOf2 = String.valueOf(list);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
                sb3.append("no AclDetails from audience: ");
                sb3.append(valueOf2);
                Log.w("AclDetails", sb3.toString());
            }
            return null;
        }
    }
}
