package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.udc.UdcCacheResponse;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.gms.userlocation.CheckInResponse;
import java.util.concurrent.TimeoutException;

/* renamed from: akwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akwx implements acvf {
    final /* synthetic */ Context a;
    final /* synthetic */ PlacesParams b;
    final /* synthetic */ akhj c;
    final /* synthetic */ akwy d;

    public akwx(akwy akwy, Context context, PlacesParams placesParams, akhj akhj) {
        this.d = akwy;
        this.a = context;
        this.b = placesParams;
        this.c = akhj;
    }

    /* renamed from: b */
    public final CheckInResponse a(acwa acwa) {
        byte[][] bArr;
        UdcCacheResponse udcCacheResponse = (UdcCacheResponse) acwa.d();
        if (udcCacheResponse.a.size() == 1) {
            if (((UdcCacheResponse.UdcSetting) udcCacheResponse.a.get(0)).a == 1) {
                if (((UdcCacheResponse.UdcSetting) udcCacheResponse.a.get(0)).b == 2) {
                    Context context = this.a;
                    Location location = alfx.a(context, this.b.b, ren.c(context), akwy.a).a;
                    aksc a2 = aksc.a(this.a, this.b, this.c);
                    try {
                        PlacesParams placesParams = this.b;
                        CheckInReport checkInReport = this.d.b;
                        long j = checkInReport.a;
                        String str = checkInReport.b;
                        int i = checkInReport.d;
                        byte[] bArr2 = checkInReport.e;
                        byte[][] bArr3 = checkInReport.f;
                        iyn iyn = a2.e;
                        ClientContext clientContext = a2.b;
                        Context context2 = a2.a;
                        aucd o = asuq.l.o();
                        asuu a3 = aksd.a(context2, placesParams);
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        asuq asuq = (asuq) o.b;
                        a3.getClass();
                        asuq.b = a3;
                        int i2 = 1 | asuq.a;
                        asuq.a = i2;
                        int i3 = i2 | 2;
                        asuq.a = i3;
                        asuq.c = j;
                        str.getClass();
                        asuq.a = i3 | 4;
                        asuq.d = str;
                        String str2 = Build.FINGERPRINT;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        asuq asuq2 = (asuq) o.b;
                        str2.getClass();
                        asuq2.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        asuq2.j = str2;
                        if (location != null) {
                            aucd o2 = avoq.c.o();
                            double latitude = location.getLatitude();
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            ((avoq) o2.b).a = latitude;
                            double longitude = location.getLongitude();
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            ((avoq) o2.b).b = longitude;
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            asuq asuq3 = (asuq) o.b;
                            avoq avoq = (avoq) o2.i();
                            avoq.getClass();
                            asuq3.e = avoq;
                            asuq3.a |= 8;
                            long time = location.getTime() * 1000;
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            asuq asuq4 = (asuq) o.b;
                            asuq4.a |= 16;
                            asuq4.f = time;
                            float accuracy = location.getAccuracy() * 1000.0f;
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            asuq asuq5 = (asuq) o.b;
                            asuq5.a |= 32;
                            asuq5.g = accuracy;
                        }
                        if (i != -1) {
                            asuq asuq6 = (asuq) o.b;
                            asuq6.a |= 64;
                            asuq6.h = i;
                        }
                        if (bArr2 != null) {
                            auay a4 = auay.a(bArr2);
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            asuq asuq7 = (asuq) o.b;
                            a4.getClass();
                            asuq7.a |= 128;
                            asuq7.i = a4;
                        }
                        if (bArr3 != null) {
                            for (byte[] a5 : bArr3) {
                                auay a6 = auay.a(a5);
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                asuq asuq8 = (asuq) o.b;
                                a6.getClass();
                                if (!asuq8.k.a()) {
                                    asuq8.k = aucj.a(asuq8.k);
                                }
                                asuq8.k.add(a6);
                            }
                        }
                        asur asur = (asur) iyn.a(clientContext, "reportCheckIn", ((asuq) o.i()).k(), (Object) asur.c, azcl.c(), 10269);
                        Context context3 = a2.a;
                        if (asur != null) {
                            asuv asuv = asur.a;
                            if (asuv == null) {
                                asuv = asuv.c;
                            }
                            aksd.a(context3, asuv);
                            int size = asur.b.size();
                            bArr = new byte[size][];
                            for (int i4 = 0; i4 < size; i4++) {
                                bArr[i4] = ((auay) asur.b.get(i4)).k();
                            }
                        } else {
                            bArr = null;
                        }
                        adtv adtv = new adtv();
                        adtv.a = bArr;
                        return adtv.a();
                    } catch (VolleyError | eif | TimeoutException e) {
                        aklz.a().c("CheckIn report to PlacesServer failed");
                        throw e;
                    }
                } else {
                    aklz.a();
                    String str3 = this.b.d;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 73);
                    sb.append("DataUploadOptIn is off for account ");
                    sb.append(str3);
                    sb.append(". CheckIn not reported to PlacesServer");
                    sb.toString();
                    return new adtv().a();
                }
            }
        }
        aklz.a().b("Call to UDC failed");
        throw new RuntimeException("Call to UDC failed");
    }
}
