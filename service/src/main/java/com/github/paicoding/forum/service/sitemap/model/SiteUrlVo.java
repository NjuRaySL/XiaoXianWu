package com.github.wucoding.forum.service.sitemap.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author RaySL
 *       2/13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "url")
public class SiteUrlVo {

    @JacksonXmlProperty(localName = "loc")
    private String loc;

    @JacksonXmlProperty(localName = "lastmod")
    private String lastMod;

}
