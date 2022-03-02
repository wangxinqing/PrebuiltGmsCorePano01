package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Flag;
import java.util.List;

/* renamed from: yic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yic extends ygu {
    private final ygj a;
    private final yid b;

    public yic(ygj ygj, String str, String str2, String str3, Flag[] flagArr) {
        super("SetFlagOverridesOperationCall", avtj.SET_FLAG_OVERRIDE);
        iva.a((Object) ygj);
        this.a = ygj;
        this.b = new yid(str2, str3, flagArr, str);
    }

    public final avst a() {
        yid yid = this.b;
        avss avss = (avss) avst.m.o();
        String str = yid.a;
        if (str != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst = (avst) avss.b;
            str.getClass();
            avst.a |= 1;
            avst.b = str;
        }
        String str2 = yid.c;
        if (str2 != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst2 = (avst) avss.b;
            str2.getClass();
            avst2.a |= 4;
            avst2.f = str2;
        }
        return (avst) avss.i();
    }

    public final void b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public final List d() {
        return this.b.b;
    }

    /* JADX INFO: finally extract failed */
    public final void b(Context context, yfw yfw) {
        int i;
        avsu a2;
        Context context2 = context;
        yid yid = this.b;
        String str = yid.a;
        if (str == null) {
            i = 29500;
        } else if (str.length() != 0) {
            String str2 = yid.c;
            if (str2 == null) {
                throw new yfy(29500, "No user");
            } else if (str2.equals("*") || yid.c.equals("") || ygd.a(yid.c, context2)) {
                Flag[] flagArr = yid.d;
                if (flagArr != null) {
                    int length = flagArr.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < length) {
                        Flag flag = flagArr[i3];
                        String str3 = flag.a;
                        if (str3 == null || str3.length() == 0) {
                            throw new yfy(29500, "No flag name");
                        } else if (flag.g == 4 && flag.d() == null) {
                            throw new yfy(29500, "Flag with null string");
                        } else if (flag.g == 5 && flag.e() == null) {
                            throw new yfy(29500, "Flag with null bytes");
                        } else {
                            if (flag.h == -1000) {
                                if (!yid.c.equals("*")) {
                                    throw new yfy(29500, "Flag commit requires user *");
                                } else if (yhe.b(yid.a)) {
                                    throw new yfy(29500, "Flag commit incompatible with direct boot");
                                }
                            }
                            i3++;
                        }
                    }
                    SQLiteDatabase writableDatabase = yfw.getWritableDatabase();
                    writableDatabase.beginTransaction();
                    try {
                        yid.a = ygb.a(yid.a, yid.e);
                        if (ayzv.j().a.contains(yid.e)) {
                            if (!yid.e.equals(yfu.b(writableDatabase, yid.a))) {
                                String str4 = yid.e;
                                String str5 = yid.a;
                                StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 33 + String.valueOf(str5).length());
                                sb.append(str4);
                                sb.append(" is not authorized to operate on ");
                                sb.append(str5);
                                throw new SecurityException(sb.toString());
                            }
                        }
                        Flag[] flagArr2 = yid.d;
                        int length2 = flagArr2.length;
                        int i4 = 0;
                        while (i4 < length2) {
                            Flag flag2 = flagArr2[i4];
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("packageName", yid.a);
                            contentValues.put("user", yid.c);
                            contentValues.put("name", flag2.a);
                            int i5 = flag2.h;
                            if (i5 == -1000) {
                                i5 = 0;
                            }
                            contentValues.put("flagType", Integer.valueOf(i5));
                            contentValues.put("committed", Integer.valueOf(i2));
                            int i6 = flag2.g;
                            if (i6 == 1) {
                                contentValues.put("intVal", Long.valueOf(flag2.a()));
                            } else if (i6 == 2) {
                                contentValues.put("boolVal", Boolean.valueOf(flag2.b()));
                            } else if (i6 == 3) {
                                contentValues.put("floatVal", Double.valueOf(flag2.c()));
                            } else if (i6 == 4) {
                                contentValues.put("stringVal", flag2.d());
                            } else if (i6 == 5) {
                                contentValues.put("extensionVal", flag2.e());
                            } else {
                                throw new yfy(29500, "Unrecognized flag type");
                            }
                            writableDatabase.insertWithOnConflict("FlagOverrides", (String) null, contentValues, 5);
                            if (flag2.h == -1000) {
                                contentValues.put("committed", 1);
                                writableDatabase.insertWithOnConflict("FlagOverrides", (String) null, contentValues, 5);
                                yid.f = true;
                            }
                            i4++;
                            i2 = 0;
                        }
                        yfm.b(writableDatabase, yid.a);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        if (yid.f) {
                            yhj.a();
                        }
                        String b2 = yfu.b(writableDatabase, yid.a);
                        if (!(b2 == null || (a2 = ygc.a(context2, yid.a, b2, 9, true)) == null)) {
                            yid.b.add(a2);
                        }
                        if (this.b.f) {
                            context.getContentResolver().notifyChange(yef.a(this.b.a), (ContentObserver) null);
                        }
                        ygf.a(context).a(this.b.a);
                        this.a.g(Status.a);
                        return;
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                } else {
                    throw new yfy(29500, "No flags");
                }
            } else {
                throw new yfy(29500, "User not on device");
            }
        } else {
            i = 29500;
        }
        throw new yfy(i, "No package name");
    }

    public final void a(Status status) {
        this.a.g(status);
    }
}
