package com.theuberlab.preloaders;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Author TheSporkboy
 */
@Component
public class MongoDBPreloader implements CommandLineRunner {
	/** A handle to the slf4j logger. */
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(MongoDBPreloader.class);

	/** The data repository if I extend this into an app backed by a database. */
//	@Autowired
//	public BipPreLoader(BigipRepository repository) {
//		this.bipRepository = repository;
//	}


	/**
	 * Creates database records.
	 */
	@Override
	public void run(String... strings) throws Exception {

	}
}
