package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.SettingState;
import java.io.IOException;
import java.util.Collections;

/* renamed from: aczr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aczr extends aczl {
    private static final amzy k = amzy.a(atzo.DEVICE_INFO, atzo.LOCATION_HISTORY, atzo.VOICE_AND_AUDIO, atzo.WEB_AND_APP, atzo.YT_SEARCH_HISTORY, atzo.YT_WATCH_HISTORY);

    public aczr(Context context, adbx adbx, ClientContext clientContext, String str, aczg aczg, byte[] bArr) {
        super(context, adbx, clientContext, str, "FetchSettingDisplayInfoOperation", aczg, bArr);
    }

    private final Intent a(String str, String str2, String str3, int i) {
        String str4;
        int i2;
        if (str3 == null) {
            Intent intent = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms");
            switch (i) {
                case 1:
                case 8:
                case 10:
                    i2 = 224;
                    break;
                case 2:
                    i2 = 227;
                    break;
                case 3:
                    i2 = 228;
                    break;
                case 4:
                    i2 = 229;
                    break;
                case 5:
                    i2 = 225;
                    break;
                case 7:
                case 9:
                    i2 = 226;
                    break;
                default:
                    i2 = 212;
                    break;
            }
            return intent.putExtra("extra.screenId", i2).putExtra("extra.accountName", str);
        }
        Context context = this.c;
        switch (i) {
            case 1:
            case 8:
            case 10:
                str4 = "app";
                break;
            case 2:
                str4 = "location";
                break;
            case 3:
                str4 = "ytsearch";
                break;
            case 4:
                str4 = "ytwatch";
                break;
            case 5:
                str4 = "audio";
                break;
            case 7:
            case 9:
                str4 = "device";
                break;
            default:
                str4 = "";
                break;
        }
        return new Intent("android.intent.action.VIEW").setData(adhr.a(str, Uri.parse(str4.length() == 0 ? new String("https://myaccount.google.com/activitycontrols/") : "https://myaccount.google.com/activitycontrols/".concat(str4)).buildUpon().appendQueryParameter("target_user_id", str2).appendQueryParameter("hl", adcp.a(context)).build().toString()));
    }

    public final void a(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        super.a(context);
        atyy atyy = (atyy) atyz.g.o();
        try {
            b();
            atyy.b(this.b, aubs.c());
            String c = c();
            String a = a(((atyz) atyy.b).c);
            if (atyy.c) {
                atyy.c();
                atyy.c = false;
            }
            atyz atyz = (atyz) atyy.b;
            a.getClass();
            atyz.a |= 2;
            atyz.c = a;
            int i = 1;
            if (azrr.b()) {
                addd.a().a();
                if (Collections.unmodifiableList(((atyz) atyy.b).d).size() == 1) {
                    int c2 = ((atyz) atyy.b).d.c(0);
                    atzo a2 = atzo.a(c2);
                    if (a2 == null || !k.contains(a2)) {
                        throw new nja(4501, "Invalid setting ID, only top-level UDC settings are supported.");
                    }
                    SettingDisplayInfo settingDisplayInfo = new SettingDisplayInfo(new SettingState(c2, 999), "", "");
                    boolean a3 = ampw.a("me", ((atyz) atyy.b).c);
                    String str5 = this.f;
                    String str6 = ((atyz) atyy.b).c;
                    if (!a3) {
                        str4 = str6;
                    } else {
                        str4 = null;
                    }
                    this.d.a(new Status(0), settingDisplayInfo, jhg.a(this.c, a(str5, str6, str4, c2), 134217728));
                    return;
                }
                throw new nja(4501, "FetchSettingDisplayInfoOperation requires exactly one setting ID.");
            }
            atzv atzv = ((atyz) atyy.b).e;
            if (atzv == null) {
                atzv = atzv.i;
            }
            aucd a4 = a(atzv);
            atyh a5 = adhi.a(this.c, c);
            if (a5 != null) {
                if (atyy.c) {
                    atyy.c();
                    atyy.c = false;
                }
                atyz atyz2 = (atyz) atyy.b;
                a5.getClass();
                atyz2.b = a5;
                atyz2.a |= 1;
            }
            if (a(((atyz) atyy.b).c, c)) {
                adao a6 = a();
                adan a7 = a6.a();
                if (a7 != null) {
                    if (Status.a.equals(a7.a)) {
                        if (atyy.c) {
                            atyy.c();
                            atyy.c = false;
                        }
                        ((atyz) atyy.b).f = aucj.s();
                        atyy.a(a7.b);
                    }
                }
                atzu b = a6.b();
                if (b != null) {
                    if (a4.c) {
                        a4.c();
                        a4.c = false;
                    }
                    atzv atzv2 = (atzv) a4.b;
                    b.getClass();
                    atzv2.h = b;
                    atzv2.a |= 128;
                } else {
                    if (a4.c) {
                        a4.c();
                        a4.c = false;
                    }
                    atzv atzv3 = (atzv) a4.b;
                    atzv3.h = null;
                    atzv3.a &= -129;
                }
            }
            if (atyy.c) {
                atyy.c();
                atyy.c = false;
            }
            atyz atyz3 = (atyz) atyy.b;
            atzv atzv4 = (atzv) a4.i();
            atzv4.getClass();
            atyz3.e = atzv4;
            atyz3.a |= 8;
            atza a8 = this.a.a(this.e, (atyz) atyy.i());
            atyi atyi = a8.b;
            if (atyi == null) {
                atyi = atyi.c;
            }
            adhi.a(atyi, this.c, c);
            if (a8.d.size() == 1) {
                atzi atzi = (atzi) a8.d.get(0);
                atzl atzl = atzi.b;
                if (atzl == null) {
                    atzl = atzl.e;
                }
                int a9 = atzk.a(atzl.d);
                if (a9 != 0) {
                    if (a9 == 5) {
                        throw new nja(4501, (String) null);
                    }
                }
                a(0);
                if ((a8.a & 8) != 0) {
                    atzn atzn = a8.c;
                    if (atzn == null) {
                        atzn = atzn.d;
                    }
                    str = atzn.c;
                } else {
                    str = null;
                }
                String str7 = this.f;
                String str8 = ((atyz) atyy.b).c;
                atzl atzl2 = atzi.b;
                if (atzl2 == null) {
                    atzl2 = atzl.e;
                }
                Intent a10 = a(str7, str8, str, atzl2.b);
                atzl atzl3 = atzi.b;
                if (atzl3 == null) {
                    atzl3 = atzl.e;
                }
                int i2 = atzl3.b;
                atzl atzl4 = atzi.b;
                if (atzl4 == null) {
                    atzl4 = atzl.e;
                }
                int a11 = atzq.a(atzl4.c);
                if (a11 != 0) {
                    i = a11;
                }
                SettingState settingState = new SettingState(i2, i - 1);
                if ((atzi.a & 32) != 0) {
                    atzn atzn2 = atzi.c;
                    if (atzn2 == null) {
                        atzn2 = atzn.d;
                    }
                    str2 = atzn2.c;
                } else {
                    str2 = null;
                }
                if ((atzi.a & 64) != 0) {
                    atzn atzn3 = atzi.d;
                    if (atzn3 == null) {
                        atzn3 = atzn.d;
                    }
                    str3 = atzn3.c;
                } else {
                    str3 = null;
                }
                this.d.a(new Status(0), new SettingDisplayInfo(settingState, str2, str3), jhg.a(this.c, a10, 134217728));
                return;
            }
            throw new nja(4505, (String) null);
        } catch (eif e) {
            throw new nja(4504, (String) null);
        } catch (VolleyError e2) {
            throw a(e2);
        } catch (auda e3) {
            throw new nja(4503, (String) null);
        } catch (IOException e4) {
            throw new nja(4505, (String) null);
        } catch (adab e5) {
            throw new nja(10, (String) null);
        }
    }

    public final void a(Status status) {
        a(status.i);
        this.d.a(status, (SettingDisplayInfo) null, (PendingIntent) null);
    }
}
