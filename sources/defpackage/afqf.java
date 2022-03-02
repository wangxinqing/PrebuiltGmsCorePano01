package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;

/* renamed from: afqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afqf implements aoqb {
    private final afqn a;

    public afqf(afqn afqn) {
        this.a = afqn;
    }

    public final aorr a(Object obj) {
        afqn afqn;
        afqn afqn2;
        String str;
        String str2;
        String str3;
        String str4 = "Failed to commit migration version to disk.";
        afqn afqn3 = this.a;
        Void voidR = (Void) obj;
        afqu afqu = afqn3.g;
        if (!afpk.a(afqu.a)) {
            afpk.c(afqu.a);
            afpk.a(afqu.a, afpj.a((int) axsv.g()));
            afqn = afqn3;
        } else {
            afpj a2 = afpj.a((int) axsv.g());
            afpj a3 = afpk.a(afqu.a, afqu.b);
            int i = a2.d;
            int i2 = a3.d;
            if (i != i2) {
                if (i < i2) {
                    afsh.b("%s Cannot migrate back from value %s to %s. Clear everything!", "SharedFilesMetadata", a3, a2);
                    afmh afmh = afqu.b;
                    String valueOf = String.valueOf(a3);
                    String valueOf2 = String.valueOf(a2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(valueOf2).length());
                    sb.append("Downgraded file key from ");
                    sb.append(valueOf);
                    sb.append(" to ");
                    sb.append(valueOf2);
                    sb.append(".");
                    afmh.a("FileKey migrations unexpected downgrade.", new Exception(sb.toString()));
                    afpk.a(afqu.a, a2);
                    afqn = afqn3;
                } else {
                    int i3 = i2 + 1;
                    while (i3 <= a2.d) {
                        try {
                            afpj a4 = afpj.a(i3);
                            int ordinal = a4.ordinal();
                            int i4 = i3;
                            if (ordinal == 1) {
                                str3 = str;
                                afqn = afqn2;
                                SharedPreferences a5 = afst.a(afqu.a, "gms_icing_mdd_shared_files", afqu.c);
                                SharedPreferences.Editor edit = a5.edit();
                                Iterator<String> it = a5.getAll().keySet().iterator();
                                while (it.hasNext()) {
                                    String next = it.next();
                                    try {
                                        aflh a6 = afqu.a(next);
                                        Iterator<String> it2 = it;
                                        afli afli = (afli) afst.a(a5, next, (auef) afli.d.c(7));
                                        if (afli == null) {
                                            afsh.a("%s: Unable to read sharedFile from shared preferences.", (Object) "SharedFilesMetadata");
                                            edit.remove(next);
                                            it = it2;
                                        } else {
                                            afst.a(edit, next);
                                            afst.a(edit, afqu.b(a6), (audx) afli);
                                            it = it2;
                                        }
                                    } catch (afqt e) {
                                        afsh.a("%s Failed to deserialize file key %s, remove and continue.", (Object) "SharedFilesMetadata", (Object) next);
                                        afqu.b.a("Failed to deserialize file key, remove and continue.", e);
                                        edit.remove(next);
                                        it = it;
                                    }
                                }
                                if (!edit.commit()) {
                                    afsh.a("Failed to commit migration metadata to disk");
                                    afqu.b.a("Failed to commit migration metadata to disk.", new Exception("Migrate to DownloadTransform failed."));
                                } else {
                                    str2 = str3;
                                    afpk.a(afqu.a, afpj.a(i4));
                                    i3 = i4 + 1;
                                    str4 = str2;
                                    afqn3 = afqn;
                                }
                            } else if (ordinal == 2) {
                                SharedPreferences a7 = afst.a(afqu.a, "gms_icing_mdd_shared_files", afqu.c);
                                SharedPreferences.Editor edit2 = a7.edit();
                                for (String next2 : a7.getAll().keySet()) {
                                    try {
                                        aflh a8 = afqu.a(next2);
                                        afqn afqn4 = afqn2;
                                        str3 = str;
                                        afli afli2 = (afli) afst.a(a7, next2, (auef) afli.d.c(7));
                                        if (afli2 == null) {
                                            afsh.a("%s: Unable to read sharedFile from shared preferences.", (Object) "SharedFilesMetadata");
                                            edit2.remove(next2);
                                            afqn2 = afqn4;
                                            str = str3;
                                        } else {
                                            afst.a(edit2, next2);
                                            afst.a(edit2, afqu.c(a8), (audx) afli2);
                                            afqn2 = afqn4;
                                            str = str3;
                                        }
                                    } catch (afqt e2) {
                                        str3 = str;
                                        afsh.a("%s Failed to deserialize file key %s, remove and continue.", (Object) "SharedFilesMetadata", (Object) next2);
                                        afqu.b.a("Failed to deserialize file key, remove and continue.", e2);
                                        edit2.remove(next2);
                                        afqn2 = afqn2;
                                        str = str3;
                                    } catch (Throwable th) {
                                        th = th;
                                        str2 = str3;
                                        String valueOf3 = String.valueOf(a2);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 75);
                                        sb2.append("Failed to commit migration version to disk. Fail to set target version to ");
                                        sb2.append(valueOf3);
                                        sb2.append(".");
                                        afsh.a(sb2.toString());
                                        afmh afmh2 = afqu.b;
                                        String valueOf4 = String.valueOf(a2);
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 28);
                                        sb3.append("Fail to set target version ");
                                        sb3.append(valueOf4);
                                        sb3.append(".");
                                        afmh2.a(str2, new Exception(sb3.toString()));
                                        throw th;
                                    }
                                }
                                str3 = str;
                                afqn = afqn2;
                                if (!edit2.commit()) {
                                    afsh.a("Failed to commit migration metadata to disk");
                                    afqu.b.a("Failed to commit migration metadata to disk.", new Exception("Migrate to ChecksumOnly failed."));
                                } else {
                                    str2 = str3;
                                    try {
                                        afpk.a(afqu.a, afpj.a(i4));
                                        i3 = i4 + 1;
                                        str4 = str2;
                                        afqn3 = afqn;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (afpk.a(afqu.a, afqu.b).d != a2.d && !afpk.a(afqu.a, a2)) {
                                            String valueOf32 = String.valueOf(a2);
                                            StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf32).length() + 75);
                                            sb22.append("Failed to commit migration version to disk. Fail to set target version to ");
                                            sb22.append(valueOf32);
                                            sb22.append(".");
                                            afsh.a(sb22.toString());
                                            afmh afmh22 = afqu.b;
                                            String valueOf42 = String.valueOf(a2);
                                            StringBuilder sb32 = new StringBuilder(String.valueOf(valueOf42).length() + 28);
                                            sb32.append("Fail to set target version ");
                                            sb32.append(valueOf42);
                                            sb32.append(".");
                                            afmh22.a(str2, new Exception(sb32.toString()));
                                        }
                                        throw th;
                                    }
                                }
                            } else {
                                String str5 = str;
                                String name = a4.name();
                                StringBuilder sb4 = new StringBuilder(String.valueOf(name).length() + 33);
                                sb4.append("Upgrade to version ");
                                sb4.append(name);
                                sb4.append("not supported!");
                                throw new UnsupportedOperationException(sb4.toString());
                            }
                            if (afpk.a(afqu.a, afqu.b).d != a2.d && !afpk.a(afqu.a, a2)) {
                                String valueOf5 = String.valueOf(a2);
                                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 75);
                                sb5.append("Failed to commit migration version to disk. Fail to set target version to ");
                                sb5.append(valueOf5);
                                sb5.append(".");
                                afsh.a(sb5.toString());
                                afmh afmh3 = afqu.b;
                                String valueOf6 = String.valueOf(a2);
                                StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 28);
                                sb6.append("Fail to set target version ");
                                sb6.append(valueOf6);
                                sb6.append(".");
                                afmh3.a(str3, new Exception(sb6.toString()));
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str2 = str;
                            String valueOf322 = String.valueOf(a2);
                            StringBuilder sb222 = new StringBuilder(String.valueOf(valueOf322).length() + 75);
                            sb222.append("Failed to commit migration version to disk. Fail to set target version to ");
                            sb222.append(valueOf322);
                            sb222.append(".");
                            afsh.a(sb222.toString());
                            afmh afmh222 = afqu.b;
                            String valueOf422 = String.valueOf(a2);
                            StringBuilder sb322 = new StringBuilder(String.valueOf(valueOf422).length() + 28);
                            sb322.append("Fail to set target version ");
                            sb322.append(valueOf422);
                            sb322.append(".");
                            afmh222.a(str2, new Exception(sb322.toString()));
                            throw th;
                        }
                    }
                    if (afpk.a(afqu.a, afqu.b).d != a2.d && !afpk.a(afqu.a, a2)) {
                        String valueOf7 = String.valueOf(a2);
                        StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf7).length() + 75);
                        sb7.append("Failed to commit migration version to disk. Fail to set target version to ");
                        sb7.append(valueOf7);
                        sb7.append(".");
                        afsh.a(sb7.toString());
                        afmh afmh4 = afqu.b;
                        String valueOf8 = String.valueOf(a2);
                        StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf8).length() + 28);
                        sb8.append("Fail to set target version ");
                        sb8.append(valueOf8);
                        sb8.append(".");
                        afmh4.a(str, new Exception(sb8.toString()));
                    }
                }
            }
            return aorl.a((Object) null);
        }
        afsh.a("%s Failed to init shared file metadata.", (Object) "MDDManager");
        return afqn.e();
    }
}
