package defpackage;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: dmx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dmx extends dlz {
    final dpa a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dmx(dmd dmd) {
        super(dmd);
        dpa dpa = new dpa(dmd);
        this.a = dpa;
    }

    private final dpb a(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue)) {
                            TextUtils.isEmpty(trim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && trim2 != null) {
                            dpa dpa = this.a;
                            if ("ga_appName".equals(attributeValue2)) {
                                dpa.b.a = trim2;
                            } else if ("ga_appVersion".equals(attributeValue2)) {
                                dpa.b.b = trim2;
                            } else if (!"ga_logLevel".equals(attributeValue2)) {
                                dpa.a.a().d("String xml configuration name not recognized", attributeValue2);
                            } else {
                                dpa.b.c = trim2;
                            }
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                            try {
                                boolean parseBoolean = Boolean.parseBoolean(trim3);
                                dpa dpa2 = this.a;
                                if (!"ga_dryRun".equals(attributeValue3)) {
                                    dpa2.a.a().d("Bool xml configuration name not recognized", attributeValue3);
                                } else {
                                    dpa2.b.e = parseBoolean ? 1 : 0;
                                }
                            } catch (NumberFormatException e) {
                                c("Error parsing bool configuration value", trim3, e);
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim4)) {
                            try {
                                int parseInt = Integer.parseInt(trim4);
                                dpa dpa3 = this.a;
                                if (!"ga_dispatchPeriod".equals(attributeValue4)) {
                                    dpa3.a.a().d("Int xml configuration name not recognized", attributeValue4);
                                } else {
                                    dpa3.b.d = parseInt;
                                }
                            } catch (NumberFormatException e2) {
                                c("Error parsing int configuration value", trim4, e2);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e3) {
            e("Error parsing tracker configuration file", e3);
        } catch (IOException e4) {
            e("Error parsing tracker configuration file", e4);
        }
        return this.a.b;
    }

    public final dpb a(int i) {
        try {
            return a(this.d.b.getResources().getXml(i));
        } catch (Resources.NotFoundException e) {
            d("inflate() called with unknown resourceId", e);
            return null;
        }
    }
}
