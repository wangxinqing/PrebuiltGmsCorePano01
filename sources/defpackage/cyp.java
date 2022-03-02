package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Service;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* renamed from: cyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cyp extends cyi {
    private static final iwd c = dit.a("IntentLauncher");
    private static final Pattern d = Pattern.compile("^((\\d+\\.)*\\d+).*");
    private final aqpt e;
    private final Fragment f;

    public cyp(aqpt aqpt, Fragment fragment, czc czc, czb czb) {
        super(czc, czb);
        this.e = aqpt;
        this.f = fragment;
    }

    private static int a(List list, List list2) {
        int max = Math.max(list.size(), list2.size());
        int i = 0;
        while (i < max) {
            int intValue = i < list.size() ? ((Integer) list.get(i)).intValue() : 0;
            int intValue2 = i < list2.size() ? ((Integer) list2.get(i)).intValue() : 0;
            if (intValue > intValue2) {
                return 1;
            }
            if (intValue < intValue2) {
                return -1;
            }
            i++;
        }
        return 0;
    }

    public static Intent a(aqpt aqpt) {
        int i;
        String str;
        aqtf aqtf;
        boolean z;
        aqpy aqpy;
        int i2;
        aqqo aqqo;
        int i3;
        aqqg aqqg;
        int i4;
        aqtb aqtb;
        int i5;
        aqrn aqrn;
        double d2;
        aqra aqra;
        float f2;
        aqrd aqrd;
        long j;
        aqrt aqrt;
        aqpt aqpt2 = aqpt;
        if (aqpt2 == null || (aqpt2.a & 1) == 0) {
            return null;
        }
        aqps aqps = aqpt2.c;
        if (aqps == null) {
            aqps = aqps.j;
        }
        if (jlh.d(aqps.b)) {
            return null;
        }
        aqps aqps2 = aqpt2.c;
        if (aqps2 == null) {
            aqps2 = aqps.j;
        }
        if (jlh.d(aqps2.c)) {
            aqps aqps3 = aqpt2.c;
            if (aqps3 == null) {
                aqps3 = aqps.j;
            }
            if (jlh.d(aqps3.d)) {
                return null;
            }
        }
        aqps aqps4 = aqpt2.c;
        if (aqps4 == null) {
            aqps4 = aqps.j;
        }
        if (!aqps4.i) {
            hya a = hya.a((Context) ihs.b());
            aqps aqps5 = aqpt2.c;
            if (aqps5 == null) {
                aqps5 = aqps.j;
            }
            if (!a.b(aqps5.b)) {
                iwd iwd = c;
                Object[] objArr = new Object[1];
                aqps aqps6 = aqpt2.c;
                if (aqps6 == null) {
                    aqps6 = aqps.j;
                }
                objArr[0] = aqps6.b;
                iwd.e("Signature check failed for %s", objArr);
                return null;
            }
        }
        int size = aqpt2.b.size();
        aucx aucx = aqpt2.b;
        int size2 = aucx.size();
        int i6 = 0;
        while (true) {
            if (i6 < size2) {
                aqpv aqpv = (aqpv) aucx.get(i6);
                if (aqpv != null) {
                    try {
                        if (!jlh.d(aqpv.a)) {
                            if (jhg.g(ihs.b(), aqpv.a)) {
                                if (aqpv.d.size() > 0 || aqpv.e.size() > 0) {
                                    String a2 = jhg.a((Context) ihs.b(), aqpv.a);
                                    try {
                                        if (!jlh.d(a2)) {
                                            Matcher matcher = d.matcher(a2);
                                            if (matcher.matches()) {
                                                amzt j2 = amzy.j();
                                                for (String valueOf : amsk.a('.').c(matcher.group(1))) {
                                                    j2.c(Integer.valueOf(valueOf));
                                                }
                                                amzy a3 = j2.a();
                                                if (aqpv.d.size() != 0) {
                                                    if (a(a3, aqpv.d) < 0) {
                                                        continue;
                                                    }
                                                }
                                                if (aqpv.e.size() != 0 && a(a3, aqpv.e) >= 0) {
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } catch (NumberFormatException e2) {
                                    }
                                }
                                if (aqpv.b <= 0) {
                                    if (aqpv.c <= 0) {
                                        break;
                                    }
                                }
                                int b = jhg.b(ihs.b(), aqpv.a);
                                if (b >= aqpv.b) {
                                    int i7 = aqpv.c;
                                    if (i7 == 0 || b <= i7) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            break;
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                    }
                }
                i6++;
            } else if (size != 0) {
                return null;
            }
        }
        Intent intent = new Intent();
        aqps aqps7 = aqpt2.c;
        if (aqps7 == null) {
            aqps7 = aqps.j;
        }
        intent.setPackage(aqps7.b);
        aqps aqps8 = aqpt2.c;
        if (aqps8 == null) {
            aqps8 = aqps.j;
        }
        if (!jlh.d(aqps8.c)) {
            aqps aqps9 = aqpt2.c;
            if (aqps9 == null) {
                aqps9 = aqps.j;
            }
            String str2 = aqps9.b;
            aqps aqps10 = aqpt2.c;
            if (aqps10 == null) {
                aqps10 = aqps.j;
            }
            intent.setClassName(str2, aqps10.c);
        }
        aqps aqps11 = aqpt2.c;
        if (aqps11 == null) {
            aqps11 = aqps.j;
        }
        for (Map.Entry entry : Collections.unmodifiableMap(aqps11.g).entrySet()) {
            String str3 = (String) entry.getKey();
            aqrb aqrb = (aqrb) entry.getValue();
            int i8 = aqrb.a;
            switch (i8) {
                case 0:
                    i = 19;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                case 7:
                    i = 7;
                    break;
                case 8:
                    i = 8;
                    break;
                case 9:
                    i = 9;
                    break;
                case 10:
                    i = 10;
                    break;
                case 11:
                    i = 11;
                    break;
                case 12:
                    i = 12;
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    i = 13;
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    i = 14;
                    break;
                case Service.START_CONTINUATION_MASK:
                    i = 15;
                    break;
                case 16:
                    i = 16;
                    break;
                case 17:
                    i = 17;
                    break;
                case 18:
                    i = 18;
                    break;
                default:
                    i = 0;
                    break;
            }
            int i9 = i - 1;
            if (i != 0) {
                switch (i9) {
                    case 0:
                        if (i8 == 1) {
                            str = (String) aqrb.b;
                        } else {
                            str = "";
                        }
                        intent.putExtra(str3, str);
                        break;
                    case 1:
                        if (i8 == 2) {
                            aqtf = (aqtf) aqrb.b;
                        } else {
                            aqtf = aqtf.b;
                        }
                        intent.putExtra(str3, (String[]) aqtf.a.toArray(new String[0]));
                        break;
                    case 2:
                        if (i8 == 3) {
                            z = ((Boolean) aqrb.b).booleanValue();
                        } else {
                            z = false;
                        }
                        intent.putExtra(str3, z);
                        break;
                    case 3:
                        if (i8 == 4) {
                            aqpy = (aqpy) aqrb.b;
                        } else {
                            aqpy = aqpy.b;
                        }
                        intent.putExtra(str3, aony.a(aqpy.a));
                        break;
                    case 4:
                        if (i8 == 5) {
                            i2 = ((Integer) aqrb.b).intValue();
                        } else {
                            i2 = 0;
                        }
                        intent.putExtra(str3, (char) i2);
                        break;
                    case 5:
                        if (i8 == 6) {
                            aqqo = (aqqo) aqrb.b;
                        } else {
                            aqqo = aqqo.b;
                        }
                        int[] a4 = aoog.a((Collection) aqqo.a);
                        char[] cArr = new char[a4.length];
                        for (int i10 = 0; i10 < a4.length; i10++) {
                            cArr[i10] = (char) a4[i10];
                        }
                        intent.putExtra(str3, cArr);
                        break;
                    case 6:
                        if (i8 == 7) {
                            i3 = ((Integer) aqrb.b).intValue();
                        } else {
                            i3 = 0;
                        }
                        intent.putExtra(str3, (byte) i3);
                        break;
                    case 7:
                        if (i8 == 8) {
                            aqqg = (aqqg) aqrb.b;
                        } else {
                            aqqg = aqqg.b;
                        }
                        intent.putExtra(str3, aooa.a((Collection) aqqg.a));
                        break;
                    case 8:
                        if (i8 == 9) {
                            i4 = ((Integer) aqrb.b).intValue();
                        } else {
                            i4 = 0;
                        }
                        intent.putExtra(str3, (short) i4);
                        break;
                    case 9:
                        if (i8 == 10) {
                            aqtb = (aqtb) aqrb.b;
                        } else {
                            aqtb = aqtb.b;
                        }
                        intent.putExtra(str3, aoom.a((Collection) aqtb.a));
                        break;
                    case 10:
                        if (i8 == 11) {
                            i5 = ((Integer) aqrb.b).intValue();
                        } else {
                            i5 = 0;
                        }
                        intent.putExtra(str3, i5);
                        break;
                    case 11:
                        if (i8 == 12) {
                            aqrn = (aqrn) aqrb.b;
                        } else {
                            aqrn = aqrn.b;
                        }
                        intent.putExtra(str3, aoog.a((Collection) aqrn.a));
                        break;
                    case 12:
                        if (i8 == 13) {
                            d2 = ((Double) aqrb.b).doubleValue();
                        } else {
                            d2 = 0.0d;
                        }
                        intent.putExtra(str3, d2);
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                        if (i8 == 14) {
                            aqra = (aqra) aqrb.b;
                        } else {
                            aqra = aqra.b;
                        }
                        intent.putExtra(str3, aooc.a((Collection) aqra.a));
                        break;
                    case UrlRequest.Status.READING_RESPONSE /*14*/:
                        if (i8 == 15) {
                            f2 = ((Float) aqrb.b).floatValue();
                        } else {
                            f2 = 0.0f;
                        }
                        intent.putExtra(str3, f2);
                        break;
                    case Service.START_CONTINUATION_MASK:
                        if (i8 == 16) {
                            aqrd = (aqrd) aqrb.b;
                        } else {
                            aqrd = aqrd.b;
                        }
                        intent.putExtra(str3, aooe.a(aqrd.a));
                        break;
                    case 16:
                        if (i8 == 17) {
                            j = ((Long) aqrb.b).longValue();
                        } else {
                            j = 0;
                        }
                        intent.putExtra(str3, j);
                        break;
                    case 17:
                        if (i8 == 18) {
                            aqrt = (aqrt) aqrb.b;
                        } else {
                            aqrt = aqrt.b;
                        }
                        intent.putExtra(str3, aook.a((Collection) aqrt.a));
                        break;
                }
            } else {
                throw null;
            }
        }
        aqps aqps12 = aqpt2.c;
        if (aqps12 == null) {
            aqps12 = aqps.j;
        }
        aucx aucx2 = aqps12.h;
        int size3 = aucx2.size();
        for (int i11 = 0; i11 < size3; i11++) {
            intent.addCategory((String) aucx2.get(i11));
        }
        aqps aqps13 = aqpt2.c;
        if (aqps13 == null) {
            aqps13 = aqps.j;
        }
        if (!jlh.d(aqps13.d)) {
            aqps aqps14 = aqpt2.c;
            if (aqps14 == null) {
                aqps14 = aqps.j;
            }
            intent.setAction(aqps14.d);
        }
        aqps aqps15 = aqpt2.c;
        if (aqps15 == null) {
            aqps15 = aqps.j;
        }
        if (!jlh.d(aqps15.e)) {
            aqps aqps16 = aqpt2.c;
            if (aqps16 == null) {
                aqps16 = aqps.j;
            }
            intent.setData(Uri.parse(aqps16.e));
        }
        aqps aqps17 = aqpt2.c;
        if (aqps17 == null) {
            aqps17 = aqps.j;
        }
        if (!jlh.d(aqps17.f)) {
            aqps aqps18 = aqpt2.c;
            if (aqps18 == null) {
                aqps18 = aqps.j;
            }
            intent.setType(aqps18.f);
        }
        return intent;
    }

    private final void a(Intent intent) {
        try {
            this.f.startActivityForResult(intent, 12);
            this.a.a(true);
        } catch (ActivityNotFoundException e2) {
            this.b.a(e2);
        }
    }

    public final void a() {
        Intent a = a(this.e);
        if (a != null) {
            a(a);
        }
    }
}
