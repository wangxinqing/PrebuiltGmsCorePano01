package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* renamed from: afqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afqu {
    public final Context a;
    public final afmh b;
    public final amri c;

    public afqu(Context context, afmh afmh, amri amri) {
        this.a = context;
        this.b = afmh;
        this.c = amri;
    }

    public static aflh a(afkn afkn, int i) {
        aucd o = aflh.g.o();
        String str = afkn.c;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aflh aflh = (aflh) o.b;
        str.getClass();
        int i2 = aflh.a | 1;
        aflh.a = i2;
        aflh.b = str;
        int i3 = afkn.d;
        aflh.a = i2 | 2;
        aflh.c = i3;
        String b2 = afsq.b(afkn);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aflh aflh2 = (aflh) o.b;
        b2.getClass();
        int i4 = aflh2.a | 4;
        aflh2.a = i4;
        aflh2.d = b2;
        aflh2.e = i - 1;
        aflh2.a = i4 | 8;
        if ((afkn.a & 32) != 0) {
            avlu avlu = afkn.g;
            if (avlu == null) {
                avlu = avlu.b;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aflh aflh3 = (aflh) o.b;
            avlu.getClass();
            aflh3.f = avlu;
            aflh3.a |= 16;
        }
        return (aflh) o.i();
    }

    public static String b(aflh aflh) {
        String str;
        StringBuilder sb = new StringBuilder(aflh.b);
        sb.append("|");
        sb.append(aflh.c);
        sb.append("|");
        sb.append(aflh.d);
        sb.append("|");
        int a2 = afkq.a(aflh.e);
        if (a2 == 0) {
            a2 = 1;
        }
        sb.append(a2 - 1);
        sb.append("|");
        if ((aflh.a & 16) == 0) {
            str = "";
        } else {
            avlu avlu = aflh.f;
            if (avlu == null) {
                avlu = avlu.b;
            }
            str = afst.a(avlu);
        }
        sb.append(str);
        return sb.toString();
    }

    public static String c(aflh aflh) {
        StringBuilder sb = new StringBuilder(aflh.d);
        sb.append("|");
        int a2 = afkq.a(aflh.e);
        if (a2 == 0) {
            a2 = 1;
        }
        sb.append(a2 - 1);
        return sb.toString();
    }

    private static String d(aflh aflh) {
        StringBuilder sb = new StringBuilder(aflh.b);
        sb.append("|");
        sb.append(aflh.c);
        sb.append("|");
        sb.append(aflh.d);
        sb.append("|");
        int a2 = afkq.a(aflh.e);
        if (a2 == 0) {
            a2 = 1;
        }
        sb.append(a2 - 1);
        return sb.toString();
    }

    public final void b() {
        afst.a(this.a, "gms_icing_mdd_shared_files", this.c).edit().clear().commit();
    }

    static String a(aflh aflh, Context context, afmh afmh) {
        afpj afpj = afpj.NEW_FILE_KEY;
        int ordinal = afpk.a(context, afmh).ordinal();
        if (ordinal == 0) {
            return d(aflh);
        }
        if (ordinal == 1) {
            return b(aflh);
        }
        if (ordinal != 2) {
            return d(aflh);
        }
        return c(aflh);
    }

    /* access modifiers changed from: package-private */
    public final aflh a(String str) {
        aucd aucd;
        List c2 = amsk.a("|").c(str);
        afpj afpj = afpj.NEW_FILE_KEY;
        int ordinal = afpk.a(this.a, this.b).ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (c2.size() != 4) {
                    String valueOf = String.valueOf(str);
                    throw new afqt(valueOf.length() == 0 ? new String("Bad-format serializedFileKey = ") : "Bad-format serializedFileKey = ".concat(valueOf));
                }
                aucd = aflh.g.o();
                String str2 = (String) c2.get(0);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aflh aflh = (aflh) aucd.b;
                str2.getClass();
                aflh.a |= 1;
                aflh.b = str2;
                int parseInt = Integer.parseInt((String) c2.get(1));
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aflh aflh2 = (aflh) aucd.b;
                aflh2.a |= 2;
                aflh2.c = parseInt;
                String str3 = (String) c2.get(2);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aflh aflh3 = (aflh) aucd.b;
                str3.getClass();
                aflh3.a |= 4;
                aflh3.d = str3;
                int a2 = afkq.a(Integer.parseInt((String) c2.get(3)));
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aflh aflh4 = (aflh) aucd.b;
                int i = a2 - 1;
                if (a2 != 0) {
                    aflh4.e = i;
                    aflh4.a |= 8;
                } else {
                    throw null;
                }
            } else if (c2.size() != 2) {
                String valueOf2 = String.valueOf(str);
                throw new afqt(valueOf2.length() == 0 ? new String("Bad-format serializedFileKey = s") : "Bad-format serializedFileKey = s".concat(valueOf2));
            } else {
                aucd = aflh.g.o();
                String str4 = (String) c2.get(0);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aflh aflh5 = (aflh) aucd.b;
                str4.getClass();
                aflh5.a |= 4;
                aflh5.d = str4;
                int a3 = afkq.a(Integer.parseInt((String) c2.get(1)));
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aflh aflh6 = (aflh) aucd.b;
                int i2 = a3 - 1;
                if (a3 != 0) {
                    aflh6.e = i2;
                    aflh6.a |= 8;
                } else {
                    throw null;
                }
            }
        } else if (c2.size() != 5) {
            String valueOf3 = String.valueOf(str);
            throw new afqt(valueOf3.length() == 0 ? new String("Bad-format serializedFileKey = ") : "Bad-format serializedFileKey = ".concat(valueOf3));
        } else {
            aucd o = aflh.g.o();
            String str5 = (String) c2.get(0);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aflh aflh7 = (aflh) o.b;
            str5.getClass();
            aflh7.a |= 1;
            aflh7.b = str5;
            int parseInt2 = Integer.parseInt((String) c2.get(1));
            if (o.c) {
                o.c();
                o.c = false;
            }
            aflh aflh8 = (aflh) o.b;
            aflh8.a |= 2;
            aflh8.c = parseInt2;
            String str6 = (String) c2.get(2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aflh aflh9 = (aflh) o.b;
            str6.getClass();
            aflh9.a |= 4;
            aflh9.d = str6;
            int a4 = afkq.a(Integer.parseInt((String) c2.get(3)));
            if (o.c) {
                o.c();
                o.c = false;
            }
            aflh aflh10 = (aflh) o.b;
            int i3 = a4 - 1;
            if (a4 != 0) {
                aflh10.e = i3;
                aflh10.a |= 8;
                if (c2.get(4) != null && !((String) c2.get(4)).isEmpty()) {
                    try {
                        avlu avlu = (avlu) afst.a((String) c2.get(4), (auef) avlu.b.c(7));
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aflh aflh11 = (aflh) o.b;
                        avlu.getClass();
                        aflh11.f = avlu;
                        aflh11.a |= 16;
                    } catch (auda e) {
                        String valueOf4 = String.valueOf(str);
                        throw new afqt(valueOf4.length() == 0 ? new String("Failed to deserialize key:") : "Failed to deserialize key:".concat(valueOf4), e);
                    }
                }
                aucd = o;
            } else {
                throw null;
            }
        }
        return (aflh) aucd.i();
    }

    public final afli a(aflh aflh) {
        return (afli) afst.a(afst.a(this.a, "gms_icing_mdd_shared_files", this.c), a(aflh, this.a, this.b), (auef) afli.d.c(7));
    }

    /* access modifiers changed from: package-private */
    public final List a() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences a2 = afst.a(this.a, "gms_icing_mdd_shared_files", this.c);
        SharedPreferences.Editor editor = null;
        for (String next : a2.getAll().keySet()) {
            try {
                arrayList.add(a(next));
            } catch (afqt e) {
                String valueOf = String.valueOf(next);
                afsh.a((Throwable) e, valueOf.length() == 0 ? new String("Failed to deserialize newFileKey:") : "Failed to deserialize newFileKey:".concat(valueOf));
                afmh afmh = this.b;
                int size = amsk.a("|").c(next).size();
                StringBuilder sb = new StringBuilder(65);
                sb.append("Failed to deserialize newFileKey, unexpected key size:");
                sb.append(size);
                afmh.a(sb.toString(), e);
                if (editor == null) {
                    editor = a2.edit();
                }
                editor.remove(next);
            }
        }
        if (editor != null) {
            editor.commit();
        }
        return arrayList;
    }

    public final boolean a(aflh aflh, afli afli) {
        return afst.a(afst.a(this.a, "gms_icing_mdd_shared_files", this.c), a(aflh, this.a, this.b), (audx) afli);
    }
}
