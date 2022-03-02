package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: avxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class avxb {
    public final XmlPullParser a;
    private final InputStream b;
    private boolean c = false;

    public avxb(InputStream inputStream, XmlPullParser xmlPullParser) {
        this.b = inputStream;
        this.a = xmlPullParser;
        if (inputStream != null) {
            try {
                xmlPullParser.setInput(inputStream, (String) null);
            } catch (XmlPullParserException e) {
                throw new avxa("Could not create XmlGDataParser", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public avwx a() {
        return new avwx();
    }

    /* access modifiers changed from: protected */
    public void b(avwx avwx) {
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (b()) {
            int eventType = this.a.getEventType();
            while (eventType != 1) {
                if (eventType != 2 || !"entry".equals(this.a.getName())) {
                    eventType = this.a.next();
                } else {
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("you shouldn't call this if hasMoreData() is false");
    }

    public final void d() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    public final void e() {
        try {
            if (this.a.getEventType() == 0) {
                try {
                    int next = this.a.next();
                    while (next != 1) {
                        if (next == 2 && "feed".equals(this.a.getName())) {
                            try {
                                int next2 = this.a.next();
                                while (next2 != 1) {
                                    if (next2 == 2) {
                                        String name = this.a.getName();
                                        if ("totalResults".equals(name)) {
                                            avwy.b(avwz.a(this.a));
                                        } else if ("startIndex".equals(name)) {
                                            avwy.b(avwz.a(this.a));
                                        } else if ("itemsPerPage".equals(name)) {
                                            avwy.b(avwz.a(this.a));
                                        } else if ("title".equals(name)) {
                                            avwz.a(this.a);
                                        } else if ("id".equals(name)) {
                                            avwz.a(this.a);
                                        } else if ("updated".equals(name)) {
                                            avwz.a(this.a);
                                        } else if ("category".equals(name)) {
                                            avwy.a(this.a.getAttributeValue((String) null, "term"));
                                            avwy.a(this.a.getAttributeValue((String) null, "scheme"));
                                        } else if ("entry".equals(name)) {
                                            return;
                                        }
                                    }
                                    next2 = this.a.next();
                                }
                                return;
                            } catch (XmlPullParserException e) {
                                throw new avxa("Unable to parse <feed>.", e);
                            } catch (IOException e2) {
                                throw new avxa("Unable to parse <feed>.", e2);
                            }
                        } else {
                            try {
                                next = this.a.next();
                            } catch (XmlPullParserException e3) {
                                throw new avxa("Could not read next event.", e3);
                            } catch (IOException e4) {
                                throw new avxa("Could not read next event.", e4);
                            }
                        }
                    }
                    throw new avxa("No <feed> found in document.");
                } catch (XmlPullParserException e5) {
                    throw new avxa("Could not read next event.", e5);
                } catch (IOException e6) {
                    throw new avxa("Could not read next event.", e6);
                }
            } else {
                throw new avxa("Attempting to initialize parsing beyond the start of the document.");
            }
        } catch (XmlPullParserException e7) {
            throw new avxa("Could not parse GData feed.", e7);
        }
    }

    public final void f() {
        avwx a2 = a();
        try {
            if (this.a.getEventType() == 0) {
                try {
                    int next = this.a.next();
                    while (next != 1) {
                        if (next == 2 && "entry".equals(this.a.getName())) {
                            try {
                                this.a.next();
                                a(a2);
                                return;
                            } catch (XmlPullParserException e) {
                                throw new avxa("Unable to parse <entry>.", e);
                            } catch (IOException e2) {
                                throw new avxa("Unable to parse <entry>.", e2);
                            }
                        } else {
                            try {
                                next = this.a.next();
                            } catch (XmlPullParserException e3) {
                                throw new avxa("Could not read next event.", e3);
                            }
                        }
                    }
                    throw new avxa("No <entry> found in document.");
                } catch (XmlPullParserException e4) {
                    throw new avxa("Could not read next event.", e4);
                } catch (IOException e5) {
                    throw new avxa("Could not read next event.", e5);
                }
            } else {
                throw new avxa("Attempting to initialize parsing beyond the start of the document.");
            }
        } catch (XmlPullParserException e6) {
            throw new avxa("Could not parse GData entry.", e6);
        }
    }

    public final avwx g() {
        if (b()) {
            try {
                int eventType = this.a.getEventType();
                if (eventType != 2) {
                    String valueOf = String.valueOf(XmlPullParser.TYPES[eventType]);
                    throw new avxa(valueOf.length() == 0 ? new String("Expected event START_TAG: Actual event: ") : "Expected event START_TAG: Actual event: ".concat(valueOf));
                }
                String name = this.a.getName();
                if ("entry".equals(name)) {
                    avwx a2 = a();
                    try {
                        this.a.next();
                        a(a2);
                        return a2;
                    } catch (avxa e) {
                        try {
                            if (b()) {
                                c();
                            }
                        } catch (XmlPullParserException e2) {
                            this.c = true;
                        }
                        String valueOf2 = String.valueOf(a2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 25);
                        sb.append("Could not parse <entry>, ");
                        sb.append(valueOf2);
                        throw new avxa(sb.toString(), e);
                    } catch (XmlPullParserException e3) {
                        try {
                            if (b()) {
                                c();
                            }
                        } catch (XmlPullParserException e4) {
                            this.c = true;
                        }
                        String valueOf3 = String.valueOf(a2);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 25);
                        sb2.append("Could not parse <entry>, ");
                        sb2.append(valueOf3);
                        throw new avxa(sb2.toString(), e3);
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 36);
                    sb3.append("Expected <entry>: Actual element: <");
                    sb3.append(name);
                    sb3.append(">");
                    throw new avxa(sb3.toString());
                }
            } catch (XmlPullParserException e5) {
                throw new avxa("Could not parse entry.", e5);
            }
        } else {
            throw new IllegalStateException("you shouldn't call this if hasMoreData() is false");
        }
    }

    /* access modifiers changed from: protected */
    public final void a(avwx avwx) {
        int eventType = this.a.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                String name = this.a.getName();
                if ("entry".equals(name)) {
                    return;
                }
                if ("id".equals(name)) {
                    avwx.a = avwz.a(this.a);
                } else if ("title".equals(name)) {
                    avwx.b = avwz.a(this.a);
                } else if ("link".equals(name)) {
                    String attributeValue = this.a.getAttributeValue((String) null, "rel");
                    String attributeValue2 = this.a.getAttributeValue((String) null, "type");
                    String attributeValue3 = this.a.getAttributeValue((String) null, "href");
                    if ("edit".equals(attributeValue)) {
                        avwx.c = attributeValue3;
                    } else if ("alternate".equals(attributeValue) && "text/html".equals(attributeValue2)) {
                        avwx.d = attributeValue3;
                    }
                } else if ("summary".equals(name)) {
                    avwx.e = avwz.a(this.a);
                } else if ("content".equals(name)) {
                    avwx.f = avwz.a(this.a);
                } else if ("author".equals(name)) {
                    int eventType2 = this.a.getEventType();
                    this.a.getName();
                    if (eventType2 != 2 || !"author".equals(this.a.getName())) {
                        String name2 = this.a.getName();
                        StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 37);
                        sb.append("Expected <author>: Actual element: <");
                        sb.append(name2);
                        sb.append(">");
                        throw new IllegalStateException(sb.toString());
                    }
                    int next = this.a.next();
                    while (next != 1) {
                        if (next != 2) {
                            if (next == 3 && "author".equals(this.a.getName())) {
                                break;
                            }
                        } else {
                            String name3 = this.a.getName();
                            if ("name".equals(name3)) {
                                avwx.g = avwz.a(this.a);
                            } else if ("email".equals(name3)) {
                                avwx.h = avwz.a(this.a);
                            }
                        }
                        next = this.a.next();
                    }
                } else if ("category".equals(name)) {
                    String attributeValue4 = this.a.getAttributeValue((String) null, "term");
                    if (attributeValue4 != null && attributeValue4.length() > 0) {
                        avwx.i = attributeValue4;
                    }
                    String attributeValue5 = this.a.getAttributeValue((String) null, "scheme");
                    if (attributeValue5 != null && attributeValue4.length() > 0) {
                        avwx.j = attributeValue5;
                    }
                } else if ("published".equals(name)) {
                    avwx.k = avwz.a(this.a);
                } else if ("updated".equals(name)) {
                    avwx.l = avwz.a(this.a);
                } else if (!"deleted".equals(name)) {
                    b(avwx);
                } else {
                    avwx.m = true;
                }
            }
            eventType = this.a.next();
        }
    }

    public final boolean b() {
        if (!this.c) {
            try {
                return this.a.getEventType() != 1;
            } catch (XmlPullParserException e) {
            }
        }
        return false;
    }
}
