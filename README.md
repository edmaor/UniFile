# UniFile
> 📬 [edmaor128@gmail.com](mailto:edmaor128@gmial.com)

<!-- TOC -->
* [UniFile](#unifile)
    * [GENERAL INFORMATION](#general-information)
    * [XML](#xml)
    * [JSON](#json)
    * [CSV](#csv)
    * [DAT](#dat)
    * [COMING_SOON](#coming_soon)
<!-- TOC -->

### GENERAL INFORMATION

 |  File Extension | Supports            |
|----------------:|:--------------------|
|     [XML](#xml) | Primitive data      |
|   [JSON](#json) | In development      |
|     [CSV](#csv) | Primitive data      |
|     [DAT](#dat) | Non-primitive data  |

> ###### RECOMMENDATIONS
> > Empty Constructor

### XML
> ###### MUSTS
> ###### 🛠️ CONSTRUCTOR
> > public XmlRW()
> ###### 🗃️ METHODS

|                                           Modifier & Type                                           | Method & Description                                               |
|:---------------------------------------------------------------------------------------------------:|:-------------------------------------------------------------------|
|  [Document](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Document.html)  | getDocument()                                                      |
|                                                void                                                 | setDocument()                                                      |
|   [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html)   | createRoot(String rootName)                                        |
|   [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html)   | createChild(String childName                                       |
|   [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html)   | createChild(String childName, String attribute, String value)      |
|   [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html)   | createElement(Element child, String field, Sting value)            |
| [Element\[\]](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html) | createElement(Element child, String[] ... valuePairs)              |
|                                                void                                                 | exportToXml(String fileName, int indentSize)                       |
|                                                void                                                 | exportToXml(String fileName, int indentSize, ArrayList<?> objects) |

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<Users>
    <User>
        <firstName>Edu</firstName>
        <lastName>Martorell</lastName>
        <height>188</height>
    </User>
</Users>
```

### JSON
> ###### MUSTS
> ###### METHODS

```json
[{
  "firstName" : "Edu",
  "lastName" : "Martorell",
  "height" : 188
}]
```

### CSV
> ###### MUSTS
> ###### METHODS

```csv
Edu,Martorell,188
```

### DAT
> ###### MUSTS
> > Implement ***[Serializable](https://docs.oracle.com/javase/7/docs/api/java/io/Serializable.html)***
> ###### METHODS

### COMING_SOON