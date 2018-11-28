package com.seven.chenhaijun.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 市级信息
 * </p>
 *
 * @author chenhaijun
 * @since 2018-11-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CityDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String state;


}
