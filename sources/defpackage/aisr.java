package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Service;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: aisr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aisr {
    public static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 12:
                return 12;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return 13;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return 14;
            case Service.START_CONTINUATION_MASK:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
            default:
                return 5;
        }
    }

    public static int a(ajci ajci) {
        int a = ajch.a(ajci.b);
        if (a == 0) {
            a = 1;
        }
        switch (a) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 12;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return 13;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return 14;
            case Service.START_CONTINUATION_MASK:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
            default:
                return 4;
        }
    }

    public static ajcd a(ActivityRecognitionResult activityRecognitionResult) {
        if (activityRecognitionResult.a.size() == 0) {
            return null;
        }
        aucd o = ajcd.f.o();
        long j = activityRecognitionResult.c;
        if (o.c) {
            o.c();
            o.c = false;
        }
        ajcd ajcd = (ajcd) o.b;
        int i = ajcd.a | 1;
        ajcd.a = i;
        ajcd.c = j;
        long j2 = activityRecognitionResult.b;
        ajcd.a = i | 2;
        ajcd.d = j2;
        for (DetectedActivity detectedActivity : activityRecognitionResult.a) {
            aucd o2 = ajci.d.o();
            int a = a(detectedActivity.a());
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ajci ajci = (ajci) o2.b;
            ajci.b = a;
            int i2 = ajci.a | 1;
            ajci.a = i2;
            int i3 = detectedActivity.e;
            ajci.a = i2 | 2;
            ajci.c = i3;
            o.a((ajci) o2.i());
        }
        if (activityRecognitionResult.c() != null) {
            Bundle c = activityRecognitionResult.c();
            for (String str : activityRecognitionResult.c().keySet()) {
                Object obj = c.get(str);
                if (obj != null) {
                    aucd o3 = ajcf.f.o();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    ajcf ajcf = (ajcf) o3.b;
                    str.getClass();
                    int i4 = ajcf.a | 2;
                    ajcf.a = i4;
                    ajcf.e = str;
                    if (obj instanceof Integer) {
                        int intValue = ((Integer) obj).intValue();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        ajcf ajcf2 = (ajcf) o3.b;
                        ajcf2.b = 3;
                        ajcf2.c = Integer.valueOf(intValue);
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        ajcf ajcf3 = (ajcf) o3.b;
                        ajcf3.d = 1;
                        ajcf3.a |= 1;
                    } else if (obj instanceof Boolean) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        ajcf ajcf4 = (ajcf) o3.b;
                        ajcf4.b = 8;
                        ajcf4.c = Boolean.valueOf(booleanValue);
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        ajcf ajcf5 = (ajcf) o3.b;
                        ajcf5.d = 1;
                        ajcf5.a |= 1;
                    } else if (obj instanceof Double) {
                        double doubleValue = ((Double) obj).doubleValue();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        ajcf ajcf6 = (ajcf) o3.b;
                        ajcf6.b = 6;
                        ajcf6.c = Double.valueOf(doubleValue);
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        ajcf ajcf7 = (ajcf) o3.b;
                        ajcf7.d = 1;
                        ajcf7.a |= 1;
                    } else if (obj instanceof Float) {
                        float floatValue = ((Float) obj).floatValue();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        ajcf ajcf8 = (ajcf) o3.b;
                        ajcf8.b = 5;
                        ajcf8.c = Float.valueOf(floatValue);
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        ajcf ajcf9 = (ajcf) o3.b;
                        ajcf9.d = 1;
                        ajcf9.a |= 1;
                    } else if (obj instanceof Long) {
                        long longValue = ((Long) obj).longValue();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        ajcf ajcf10 = (ajcf) o3.b;
                        ajcf10.b = 4;
                        ajcf10.c = Long.valueOf(longValue);
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        ajcf ajcf11 = (ajcf) o3.b;
                        ajcf11.d = 1;
                        ajcf11.a |= 1;
                    } else {
                        if (obj instanceof String) {
                            String str2 = (String) obj;
                            str2.getClass();
                            ajcf.b = 7;
                            ajcf.c = str2;
                            ajcf.d = 1;
                        } else {
                            ajcf.d = 0;
                        }
                        ajcf.a = i4 | 1;
                    }
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    ajcd ajcd2 = (ajcd) o.b;
                    ajcf ajcf12 = (ajcf) o3.i();
                    ajcf12.getClass();
                    if (!ajcd2.e.a()) {
                        ajcd2.e = aucj.a(ajcd2.e);
                    }
                    ajcd2.e.add(ajcf12);
                }
            }
        }
        return (ajcd) o.i();
    }

    public static ActivityRecognitionResult a(ajcd ajcd) {
        Bundle bundle;
        int size = ajcd.b.size();
        if (size == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(size);
        aucx aucx = ajcd.b;
        int size2 = aucx.size();
        for (int i = 0; i < size2; i++) {
            ajci ajci = (ajci) aucx.get(i);
            arrayList.add(new DetectedActivity(a(ajci), ajci.c));
        }
        if (ajcd.e.size() > 0) {
            Bundle bundle2 = new Bundle();
            aucx aucx2 = ajcd.e;
            int size3 = aucx2.size();
            for (int i2 = 0; i2 < size3; i2++) {
                ajcf ajcf = (ajcf) aucx2.get(i2);
                String str = ajcf.e;
                int i3 = ajcf.b;
                if (i3 == 3) {
                    bundle2.putInt(str, ((Integer) ajcf.c).intValue());
                } else if (i3 == 8) {
                    bundle2.putBoolean(str, ((Boolean) ajcf.c).booleanValue());
                } else if (i3 == 6) {
                    bundle2.putDouble(str, ((Double) ajcf.c).doubleValue());
                } else if (i3 == 5) {
                    bundle2.putFloat(str, ((Float) ajcf.c).floatValue());
                } else if (i3 == 4) {
                    bundle2.putFloat(str, (float) ((Long) ajcf.c).longValue());
                } else if (i3 == 7) {
                    bundle2.putString(str, (String) ajcf.c);
                }
            }
            bundle = bundle2;
        } else {
            bundle = null;
        }
        return new ActivityRecognitionResult(arrayList, ajcd.d, ajcd.c, bundle);
    }
}
